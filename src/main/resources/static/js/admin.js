$(document).ready(function(){
	$if (admin.adminAccess != 'C') {		
		$("input").append( 'readonly');
	};
});
