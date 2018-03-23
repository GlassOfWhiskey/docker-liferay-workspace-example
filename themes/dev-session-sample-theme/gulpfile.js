'use strict';

var gulp = require('gulp');
var liferayThemeTasks = require('liferay-theme-tasks');

liferayThemeTasks.registerTasks({
	gulp: gulp,
//	hookModules: [ 'docker-gulp-tasks-4-liferay' ],
//	dockerContainerName: 'liferay_portal_1'
});