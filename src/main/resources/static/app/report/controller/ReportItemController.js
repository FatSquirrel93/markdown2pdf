(function() {
	'use strict';

	app.controller('ReportItemController', [ '$scope', 'ReportDataService', '$rootScope', function($scope, ReportDataService, $rootScope) {

		var vm = this;

		$scope.report = {};

		$scope.$on('report.select', function(event, report) {
			console.log('revieced broadcast', report);
			$scope.report = report;
		});

		$scope.save = function() {
			ReportDataService.save($scope.report).then(function(response) {
				console.log('response', response);
				$scope.report = response.data;
				vm.broadcastUpdate();
			});
		}
		
		$scope.reset = function() {
			$scope.report = {};
		}
		
		vm.broadcastUpdate = function() {
			$rootScope.$broadcast('reports.reload');
		}

		activate();

		function activate() {
		}

	} ]);

})();