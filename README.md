After performing `terraform init` once, just issue the following command to observe the bug:

```bash
./mvnw clean package && terraform apply -auto-approve && curl -v "$(terraform output -raw api_endpoint)"
```