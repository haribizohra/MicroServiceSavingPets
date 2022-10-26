<h1> Saving Pets </h1>
<p align="center">
<img src="https://user-images.githubusercontent.com/47689590/197970764-74b54841-2e44-42c5-b0b9-da449d7e4b3f.jpg" alt="istockphoto-1222913562-612x612" width="200" />
</p>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#execution">Execution Process</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
This project is composed by microservices built with different programming languages and database. 
We used Eureka which is an application that holds the information about all client-service applications. 
Also, we used docker to put our microservices in containers.
This project is composed by:
<h4>eureka-server:</h4> Serveur de découverte Eureka
<h4>api-gateway:</h4>  Spring cloud Gateway aims to provide a simple yet effective way to route to APIs and provide them with cross-cutting concerns such as: security, monitoring/metrics, and resiliency.
<h4>User-server:</h4> built with Nodejs, mongoDB, Angular used as authentification server
<h4>local-server:</h4> built with Spring Boot, Spring Data JPA, Mongodb used to creade/update/delete/show shelters for pets
<h4>Assiociation-server:</h4> built with Spring Boot, Spring Data JPA, Mysql used to creade/update/delete/show associations for pets
<h4>forum-server:</h4> built with Spring Boot, Spring Data JPA, Mysql used to communicate
<h4>Campagne-server:</h4> built with Spring Boot, Spring Data JPA, H2 used to communicate



<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

This project is built with the following technologies:

* [![Springboot][Springboot.com]][Springboot-url]
* [![Nodejs][Nodejs.org]][Nodejs-url]
* [![Angular][Angular.io]][Angular-url]
*  [![Mysql][Mysql.com]][Mysql-url]
*  [![H2][H2.com]][H2-url]
* [![Mongodb][Mongodb.com]][Mongodb-url]

We also needed to use Eureka and docker.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites
* Maven 3.0+ 
* Your favorite IDE but we recommand STS-4-4.4.1 version.
* MySQL server
* JDK 1.8+
* Docker

### Execution Process

After installing the necessary tools, please proceed as mentioned below:

1. Clone the repo
  https://github.com/haribizohra/MicroServiceSavingPets.git
  
2. Run docker compose
   ```sh
   docker-compose up
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Here is a link to our Github Project!
Project Link: [https://github.com/haribizohra/MicroServiceSavingPets](https://github.com/haribizohra/MicroServiceSavingPets.git)

<p align="right">(<a href="#readme-top">back to top</a>)</p>






<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Mongodb.com]: https://img.shields.io/badge/mongodb-32CD32?style=for-the-badge&logo=mongodb&logoColor=white
[Mongodb-url]:https://www.mongodb.com/
[Springboot.com]:https://img.shields.io/badge/springboot-32CD32?style=for-the-badge&logo=springboot&logoColor=white
[Springboot-url]:https://spring.io/
[Nodejs.org]:https://img.shields.io/badge/node.js-32CD32?style=for-the-badge&logo=node.js&logoColor=white
[Nodejs-url]:https://nodejs.org/
[Mysql.com]:https://img.shields.io/badge/mysql-4169E1?style=for-the-badge&logo=mysql&logoColor=white
[Mysql-url]:https://spring.io/
[H2.com]:https://img.shields.io/badge/h2-4169E1?style=for-the-badge&logo=h2&logoColor=white
[H2-url]:https://www.h2database.com/
