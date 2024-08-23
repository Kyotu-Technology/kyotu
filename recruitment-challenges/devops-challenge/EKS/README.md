
# EKS Cluster Setup Challenge



Welcome to the DevOps recruitment challenge! In this task, you'll demonstrate your skills in infrastructure as code, cloud architecture, and Kubernetes management.



## Objective



Create a cost-effective, multi-AZ Amazon EKS (Elastic Kubernetes Service) cluster using Terraform. The cluster should be capable of automatically scaling to meet fluctuating resource demands.



## Requirements



1. Use Terraform to provision all resources.

2. The EKS cluster must span multiple Availability Zones for high availability.

3. Implement cluster autoscaling to handle varying workloads efficiently.

4. Deploy and configure External DNS.

5. Set up necessary IAM roles and permissions for the cluster to interact with Route 53.



## Detailed Tasks



1. **EKS Cluster Setup**

   - Provision a multi-AZ EKS cluster using the most cost-effective way.

   - Ensure the cluster is configured for high availability.



2. **Cluster Autoscaler**

   - Implement the Kubernetes Cluster Autoscaler.

   - Configure it to scale worker nodes based on resource demand.



3. **External DNS**

   - Create a Kubernetes service account with the necessary permissions to manage Route 53 records.

   - Use IAM roles for service accounts (IRSA) to grant these permissions securely.

   - Deploy External DNS in the cluster.

   - Configure it to work with Amazon Route 53 and utilize IRSA.


## Evaluation Criteria



- Cost-effectiveness of the solution

- Proper use of Terraform best practices

- Correct implementation of multi-AZ architecture

- Functionality of the cluster autoscaler

- Successful deployment and configuration of External DNS

- Correct setup of IAM roles and permissions

- Code quality, readability, and documentation



## Submission Guidelines



- Provide a GitHub repository with your Terraform code and any additional scripts or configurations.

- Include a README.md with:

  - Clear instructions on how to deploy your solution

  - Any assumptions or design decisions you made

  - A brief explanation of how you approached cost optimization



## Tips



- Consider using Spot Instances for worker nodes to reduce costs, but be sure to handle interruptions gracefully.

- Leverage Terraform modules to keep your code DRY and maintainable.

- Use Terraform workspaces or similar strategies to manage different environments (e.g., staging, production).



Good luck! We're excited to see your innovative and efficient solution to this challenge.
