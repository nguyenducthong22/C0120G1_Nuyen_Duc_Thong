let listCustomer=[];
let validateBirthday= /^((0)[1-9]|(1)[0-9]|(2)[0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;
let validateEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
function displayMainMenu() {
    let choose=prompt(
        "1.Add New Customer"+
        "\n2. Display Information Customer "+
        "\n3. Display Total Pay Of Customer"+
        "\n4. Edit Information Customer"+
        "\n5. Delete Customer"+
        "\n6. Exit"
    );
switch (choose) {
    case "1" :
        addNewCustomer();
        break;
    case "2":
        displayCustomer();
        break;
    case "3":
        chooseDisplayTotalPay();
        break;
    case "4":
        chooseCustomerEdit();
        break;
    case "5":
        chooseDeleteCustomer();
        break;
    case "6":
        return;
    default :
        displayMainMenu();
        break;
    }
}
function addNewCustomer() {
    let checkBirthday=false;
    let checkEmail=false;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Enter name customer: "));
    cus.setIdCard(prompt("Enter Id Card: "));
    do {
    cus.setBirthdayCustomer(prompt("Enter birthday Customer: "))
    if (validateBirthday.test(cus.getBirthdayCustomer())){
        checkBirthday=true;
    }
    else {alert("Birth is invalid. Please try again!")}
    }
    while (!checkBirthday);

    do {
    cus.setEmailCustomer(prompt("Enter Email Customer: "))
    if (validateEmail.test(cus.getEmailCustomer())){
        checkEmail=true;
    }
    else {
        alert("Email is invalid. Please try again!")
    }
    }
    while (!checkEmail);

    cus.setAddressCustomer(prompt("Enter Address Customer: "));
    cus.setTypeCustomer(prompt("Enter Type Customer: "));
    cus.setDiscount(prompt("Enter Discount: "));
    cus.setNumberOfAccompanying(prompt("Enter Number Of Accompanying: "));
    cus.setTypeRoom(prompt("Enter Type Room: "));
    cus.setRentDays(prompt("Enter Rent Days: "));
    cus.setTypeService(prompt("Enter Type Service: "));
    listCustomer.push(cus);
}
displayMainMenu();