'use strict'

var gulp = require('gulp'),
    nodemon = require('gulp-nodemon'),
    browserSync = require('browser-sync').create();

gulp.task('default', ['browser-sync'], function() {

});

gulp.task('browser-sync', function  () {
	browserSync.init({
		baseDir:'./public'
	});
	gulp.watch('public/**/*').on('change', browserSync.reload);
});



// gulp.task('browser-sync', ['nodemon'], function() {
//     browserSync.init(null, {
//         proxy: 'http://localhost:5000',
//         files: ['public/**/*'],
//         browser: 'google chrome',
//         port: 7000
//     });
// })

gulp.task('nodemon', function(cb) {
    var started = false;
    return nodemon({
        script: 'server.js'
    }).on('start', function() {
        if (!started) {
            cb();
            started = true;
        }
    })
})



// gulp.task('lr', function() {
//     browserSync.init({
//         server: {
//             baseDir: './'
//         }
//     });
// })
