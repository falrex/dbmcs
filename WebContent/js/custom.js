var educationID = 1;
var employmentID = 1;


function addEducation() {
    var newDiv = document.createElement('span');
    newDiv.id = "educationCertification" + educationID;
    newDiv.innerHTML = getEducationHTML(educationID);
    document.getElementById("educationSpan").appendChild(newDiv);
    
    educationID ++;
}

function removeEducation(id) {
    var element = document.getElementById("educationSpan");
    var child = document.getElementById("educationCertification" + id);
    element.removeChild(child);
}

function getEducationHTML(id) {
    return  "<div class='row form-subheader top10'>" +
            "<div class='col-lg-10'> <button type='button' class='btn btn-xs btn-danger' onClick=removeEducation(" + id + ") ><i class='fa fa-times'></i>  </button>  <b>Education and Certification</b> </div>" +
            "<div class='col-lg-2'>  </div>" +
        "</div>" +
        
        "<div class='row top5'></div>" +
        
        "<div class='row top7'>" +
            "<div class='col-lg-3 bordered'><label> Education Attainment </label></div>" +                    
            "<div class='col-lg-3 bordered'>  " +
                "<select class='form-control' name='educationalAttainment'> " +
                    "<option>Grade School</option>" +
                    "<option>High School</option>" +
                    "<option>College</option>" +
                    "<option>Certification</option>" +
                    "<option>Graduate School</option>" +
                "</select>" +
            "</div>" +
            "<div class='col-lg-3 bordered'><label> School </label></div>" +                    
            "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='school'>  </div>" +    
        "</div>" +
        
        "<div class='row top7'>" +
            "<div class='col-lg-3 bordered'><label> Course </label></div>" +                    
            "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='course'> </div>" +
            "<div class='col-lg-3 bordered'><label> Year </label></div>" +                    
            "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='year'>  </div>" +    
        "</div>" +
        
        "<div class='row top7'>" +
            "<div class='col-lg-3 bordered'><label> GPA </label></div>" +                    
            "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='gpa'> </div>" +
            "<div class='col-lg-3 bordered'><label> Awards & Honors </label></div>" +                    
            "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='awards'>  </div>" +    
        "</div>";
}

function addEmployment() {
    var newDiv = document.createElement('span');
    newDiv.id = "employmentHistory" + employmentID;
    newDiv.innerHTML = getEmploymentHTML(employmentID);
    document.getElementById("employmentSpan").appendChild(newDiv);
    
    employmentID++;
}

function removeEmployment(id) {
    var element = document.getElementById("employmentSpan");
    var child = document.getElementById("employmentHistory" + id);
    element.removeChild(child);
}

function getEmploymentHTML(id) {
    return "<div class='row form-subheader top10'>" +
        "<div class='col-lg-10'> <button type='button' class='btn btn-xs btn-danger' onClick=removeEmployment(" + id + ")><i class='fa fa-times'></i>  </button>  <b>Employment History</b> </div>" +
        "<div class='col-lg-2'>  </div>" +
    "</div>" +
    
    "<div class='row top5'></div>" +
    
    "<div class='row top7'>" +
        "<div class='col-lg-3 bordered'><label> Company Name </label></div>" +                    
        "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='company'> </div>" +
        "<div class='col-lg-3 bordered'><label> Company Address </label></div>" +                    
        "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='companyAddress'>  </div>" +    
    "</div>" +
    
    "<div class='row top7'>" +
        "<div class='col-lg-3 bordered'><label> Position </label></div>" +                    
        "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='position'> </div>" +
        "<div class='col-lg-3 bordered'><label> Start Date </label></div>" +                    
        "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='startDate'>  </div>" +    
    "</div>" +
    
    "<div class='row top7'>" +
        "<div class='col-lg-3 bordered'><label> End Date </label></div>" +                    
        "<div class='col-lg-3 bordered'>  <input type='text' class='form-control' name='endDate'> </div>" +
    "</div>";
}