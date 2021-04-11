# spring-apiRest-demo

## Allowed HTTP requests

**GET** /searchMovie

## Params: 

 * **apiKey** = "key to interact with this api"
 * **title** = "title/words to search the movie"


**Example** -> <br/> http://localhost:8080/searchMovie?apiKey=JSQ8DA8q3WCrVCuy7bmAYneddQcsmmYg&title=La%20guerra%20de%20las%20galaxias

**Response**: <br/>
  * If apiKey is invalid  ->  
  ```json
  { error: Unauthorized }
  ```
  * If apiKey is valid  -> <br/>
  
  ```json
{page: 1,…}
    page: 1
  results: [{adult: false, backdrop_path: null, genre_ids: [99], id: 522640, original_language: "es",…},…]
    0: {adult: false, backdrop_path: null, genre_ids: [99], id: 522640, original_language: "es",…}
      adult: false
      backdrop_path: null
      genre_ids: [99]
      id: 522640
      original_language: "es"
      original_title: "Criaturas de La guerra de las galaxias"
      overview: ""
      popularity: 1.96
      poster_path: null
      release_date: "2006-12-12"
      title: "Criaturas de La guerra de las galaxias"
      video: false
      vote_average: 0
      vote_count: 0
    1: {adult: false, backdrop_path: "/ae9xlnkS2qb5Dy9Mtlu68AWh42O.jpg",…}
    2: {adult: false, backdrop_path: "/jn52me8AagfNt7r84SgQbV0R9ZG.jpg", genre_ids: [28, 12, 878], id: 181812,…}
    3: {adult: false, backdrop_path: "/k6EOrckWFuz7I4z4wiRwz8zsj4H.jpg", genre_ids: [28, 12, 878, 14],…}
    4: {adult: false, backdrop_path: "/6t8ES1d12OzWyCGxBeDYLHoaDrT.jpg", genre_ids: [28, 12, 878], id: 330459,…}
    5: {adult: false, backdrop_path: "/5Iw7zQTHVRBOYpA0V6z0yypOPZh.jpg", genre_ids: [878, 28, 12], id: 181808,…}
    6: {adult: false, backdrop_path: "/dUkCHy02dtFWQwyCKQKlf1sRm0D.jpg", genre_ids: [16, 12, 10751, 14, 878],…}
    7: {adult: false, backdrop_path: "/vys9PaP6EtjAXEKwGtpVXmeklps.jpg", genre_ids: [878, 28, 12, 14],…}
    8: {adult: false, backdrop_path: "/zqkmTXzjkAgXmEWLRsY4UpTWCeo.jpg", genre_ids: [12, 28, 878], id: 11,…}
    9: {adult: false, backdrop_path: "/dNt5q68BBkddBxlvrHDa1apyBy8.jpg", genre_ids: [12, 28, 878], id: 1894,…}
    10: {adult: false, backdrop_path: "/uuh6uNEGqLCU7wQ2L4xMqYv0DPr.jpg", genre_ids: [878, 12, 28], id: 1895,…}
    11: {adult: false, backdrop_path: "/iP2tEA2A77qhbhRfcFkiD6WFOqH.jpg", genre_ids: [12, 28, 878], id: 1892,…}
    12: {adult: false, backdrop_path: "/dMZxEdrWIzUmUoOz2zvmFuutbj7.jpg", genre_ids: [12, 28, 878], id: 1891,…}
    13: {adult: false, backdrop_path: "/9r4IRZUJ564J38EcLRPM9uUZlVp.jpg", genre_ids: [12, 28, 878], id: 1893,…}
    
    total_pages: 1
    total_results: 14

```
