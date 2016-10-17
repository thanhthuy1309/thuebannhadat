/* START: Man hinh dang ky step 1: register_social_step1 */

/**
 * Khi bam button huy o man hinh dang ky step 1
 */
function registerStep1Cancel() {
	submitform("phoneFrm", "registerStep1Cancel");
}

/**
 * Khi bam button xac nhan o man hinh dang ky step 1
 */
function registerStep1Approve() {
	submitform("phoneFrm", "registerStep1Approve");
}

/* END: Man hinh dang ky step 1: register_social_step1 */

/* START: Man hinh dang ky step 1: register_social_step2 */

/**
 * khi bam button lay lai ma
 */
function getCodeAgain() {
	submitform("codeFrm", "getCodeAgain");
}

/**
 * khi bam button gui ma code
 */
function submitCode() {
	submitform("codeFrm", "submitCode");
}
/* END: Man hinh dang ky step 1: register_social_step2 */