var app = angular.module('m2pdfModule', [ 'hc.marked', 'hljs', 'angular-markdown-editor' ])
	.config([ 'markedProvider', 'hljsServiceProvider', function(markedProvider, hljsServiceProvider) {
		// marked config
		markedProvider.setOptions({
			gfm : true,
			tables : true,
			sanitize : true,
			highlight : function(code, lang) {
				if (lang) {
					return hljs.highlight(lang, code, true).value;
				} else {
					return hljs.highlightAuto(code).value;
				}
			}
		});

		// highlight config
		hljsServiceProvider.setOptions({
			// replace tab with 4 spaces
			tabReplace : '    '
		});
	} ]);