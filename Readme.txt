post mapping url:http://localhost:9091/pgr
sample json:
{
    "name": "Saveen",
    "address": "dsds",
    "phone": "9446005304",
    "grievance":"NO",
    "dateofsubmission": "2024-08-31"
      
}
Data Validations:
- name cannot be empty
- address cannot be empty
- grievance cannot be empty
- dateofsubmission should be today’s date
Return bad request on validation error
Return 201 response code with the product id as the response on success
Status should be always set as CREATED for new tasks.
Enabled Swagger for API documentation