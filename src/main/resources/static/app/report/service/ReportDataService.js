(function() {
	'use strict';

	app.factory('ReportDataService', [ '$http', 'API_PATH_REPORTS',

		function($http, API_PATH_REPORTS) {

			return {
				findAll : findAll,
				save : save,
			};

			function findAll() {
				return $http.get(API_PATH_REPORTS);
			}
			
			function save(report) {
				if(report.id) {
					return $http.put(API_PATH_REPORTS, report);
				}
				
				return $http.post(API_PATH_REPORTS, report);
			}

		} ])
})();