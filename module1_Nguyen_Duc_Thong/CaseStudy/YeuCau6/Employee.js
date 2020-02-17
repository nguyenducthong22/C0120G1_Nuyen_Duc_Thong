let Employee = function () {

    this.setNameEmployee = function (nameEmployee) {
        this.nameEmployee = nameEmployee;
    };
    this.getNameEmployee = function () {
        return this.nameEmployee;
    };

    this.setPhoneNumberEmployee = function (phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    };
    this.getPhoneNumberEmployee = function () {
        return this.phoneNumberEmployee;
    };

    this.setIdCardEmployee = function (idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    };
    this.getIdCardEmployee = function () {
        return this.idCardEmployee;
    };

    this.setBirthdayEmployee = function (birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    };
    this.getBirthdayEmployee = function () {
        return this.birthdayEmployee;
    };

    this.setEmailEmployee = function (emailEmployee) {
        this.emailEmployee = emailEmployee;
    };
    this.getEmailEmployee = function () {
        return this.emailEmployee;
    };

    this.setLevelEmployee = function (levelEmployee) {
        this.levelEmployee = levelEmployee;
    };
    this.getLevelEmployee = function () {
        return this.levelEmployee;
    };

    this.setLocationEmployee = function (locationEmployee) {
        this.locationEmployee = locationEmployee;
    };
    this.getLocationEmployee = function () {
        return this.locationEmployee;
    };

    this.setSalaryEmployee = function (salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    };
    this.getSalaryEmployee = function () {
        return this.salaryEmployee;
    };

    this.setWorkEmployee = function (workEmployee) {
        this.workEmployee = workEmployee;
    };
    this.getWorkEmployee = function () {
        return this.workEmployee;
    };

    this.totalSalaryEmployee = function () {
        let result = parseInt(this.getSalaryEmployee());

        if (this.getWorkEmployee().toLowerCase().replace(/ /g, '') == "manager") {
            result += 500;
        } else if (this.getWorkEmployee().toLowerCase().replace(/ /g, '') == "sale") {
            result += 300;
        } else if (this.getWorkEmployee().toLowerCase().replace(/ /g, '') == "manager") {
            result += 200;
        }

        return result;
    }
};