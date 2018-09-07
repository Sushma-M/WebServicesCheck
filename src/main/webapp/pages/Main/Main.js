Application.$controller("MainPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };


    $scope.GoogleapisInvokeonSuccess = function(variable, data) {
        $scope.Widgets.accordionpane1.badgetype = "success";
        $scope.Widgets.accordionpane1.badgevalue = "success";
    };


    $scope.Googleapis_jsonInvokeonSuccess = function(variable, data) {
        $scope.Widgets.accordionpane2.badgetype = "success";
        $scope.Widgets.accordionpane2.badgevalue = "success";
    };


    $scope.googleapis_typeInvokeonSuccess = function(variable, data) {
        $scope.Widgets.accordionpane3.badgetype = "info";
        if ($scope.Widgets.formatToggle1.datavalue == "xml") {
            $scope.Widgets.accordionpane3.badgevalue = "XML";
        } else if ($scope.Widgets.formatToggle1.datavalue == "json") {
            $scope.Widgets.accordionpane3.badgevalue = "JSON";
        }
    };


    $scope.Google_atomInvokeonSuccess = function(variable, data) {
        $scope.Widgets.accordionpane4.badgetype = "success";
        $scope.Widgets.accordionpane4.badgevalue = "success";
    };

}]);

Application.$controller("GoogleServiceGrid1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("GoogleServiceGrid2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("GoogleServiceGrid3Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("grid4Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid5Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid7Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid8Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid8_1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid9Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid10Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid11Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid12Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid13Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid14Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid15Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);





Application.$controller("executeTestQueryTable1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);