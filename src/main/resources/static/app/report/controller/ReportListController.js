(function() {
	'use strict';

	app.controller('ReportListController', [ '$scope', 'ReportDataService', '$rootScope', function($scope, ReportDataService, $rootScope) {

		var vm = this;

		$scope.reports = [];

		$scope.$on('reports.reload', function() {
			vm.findAll();
		});
		
		vm.findAll = function() {
			ReportDataService.findAll().then(function(response) {
				$scope.reports = response.data;
			});
		}
		
		$scope.select = function(report) {
			console.log('broadcasting', report);
			$rootScope.$broadcast('report.select', angular.copy(report));
		}

		activate();

		function activate() {
			vm.findAll();
		}

	} ]);

})();