var mountFolder = function(connect, dir) {
    return connect.static(require('path').resolve(dir));
};
module.exports = function(grunt) {

    require('load-grunt-tasks')(grunt);

    grunt.registerTask('serve', ['connect:serve', 'watch']);

    grunt.registerTask('dev', [
        'clean',
        'ngTemplateCache',
        'concat',
        'less',
        'copy'
    ]);

    grunt.registerTask('default', [
        'dev',
    'uglify',
        'cssmin'
    ]);

    grunt.initConfig({
        cmpnt: grunt.file.readJSON('bower.json'),
        banner: '/*! ngTable v<%= cmpnt.version %> by Vitalii Savchuk(esvit666@gmail.com) - ' +
            'https://github.com/esvit/ng-table - New BSD License */\n',
        clean: {

            working: {
                src: ['ng-table.*', './.temp/views', './.temp/']
            }
        },
        copy: {
            styles: {
                files: [{
                    src: './app/styles/ng-table.less',
                    dest: './dist/ng-table.less'
                }]
            }
        },
        uglify: {
            js: {
                src: ['./dist/ng-table.js'],
                dest: './dist/ng-table.min.js',
                options: {
                    banner: '<%= banner %>',
                    sourceMap: true
                }
            }
        },
        concat: {
            js: {
                src: [
                    'app/scripts/01-*.js',
                    'app/scripts/02-*.js',
                    'app/scripts/ngTableEventsChannel.js',
                    'app/scripts/ngTableFilterConfig.js',
                    'app/scripts/ngTableDefaultGetData.js',
                    'app/scripts/ngTableGetDataBcShim.js',
                    'app/scripts/03-*.js',
                    'app/scripts/ngTableFilterRowController.js',
                    'app/scripts/ngTableSorterRowController.js',
                    'app/scripts/04-*.js',
                    'app/scripts/05-*.js',
                    'app/scripts/06-*.js',
                    './.temp/scripts/views.js',
                    'app/scripts/07-*.js'
                ],
                dest: './dist/ng-table.js'
            }
        },
        less: {
            css: {
                files: {
                    './dist/ng-table.css': 'app/styles/ng-table.less'
                }
            }
        },
        cssmin: {
            css: {
                files: {
                    './dist/ng-table.min.css': './dist/ng-table.css'
                },
                options: {
                    banner: '<%= banner %>'
                }
            }
        },
        watch: {
            css: {
                files: 'app/styles/*.less',
                tasks: ['less'],
                options: {
                    livereload: true
                }
            },
            js: {
                files: 'app/scripts/*.js',
                tasks: ['concat'],
                options: {
                    livereload: true
                }
            },
            html: {
                files: 'app/ng-table/*.html',
                tasks: ['ngTemplateCache', 'concat'],
                options: {
                    livereload: true
                }
            }
        },
        connect: {
            options: {
                port: 8000,
                hostname: 'localhost'
            },
            serve: {
                options: {
                    middleware: function(connect) {
                        return [
                            mountFolder(connect, '.')
                        ];
                    }
                }
            }
        },
        ngTemplateCache: {
            views: {
                files: {
                    './.temp/scripts/views.js': 'app/ng-table/**/*.html'
                },
                options: {
                    trim: 'app/',
                    module: 'ngTable'
                }
            }
        }
    });
};
