/* START: Man hinh dang ky step 1: register_social_step1 */

/**
 * Khi bam button huy o man hinh dang ky step 1
 */
function registerStep1Cancel() {
	submitform("phoneFrm", "huy-dang-ky");
}

/**
 * Khi bam button xac nhan o man hinh dang ky step 1
 */
function registerStep1Approve() {
	submitform("phoneFrm", "xac-nhan");
}

/* END: Man hinh dang ky step 1: register_social_step1 */

/* START: Man hinh dang ky step 1: register_social_step2 */

/**
 * khi bam button lay lai ma
 */
function getCodeAgain() {
	submitform("codeFrm", "lay-lai-ma");
}

/**
 * khi bam button gui ma code
 */
function submitCode() {
	submitform("codeFrm", "gui-ma");
}
/* END: Man hinh dang ky step 1: register_social_step2 */