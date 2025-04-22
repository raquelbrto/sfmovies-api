# SF Movies API

Nesse desafio foi implementado o cache com caffeine e tambem com redis(na branch feature_improvement_cache_redis), fazemos a requisição para pegar as informacoes sobre os locais dos filmes, os dados vem em json e a gente faz o parse para a entidade Movie location.


### - Buscar todos os filmes
        
        curl -X GET http://localhost:8081/api/v1/movies

### - Buscar filmes pelo titulo

        curl -X GET "http://localhost:8081/api/v1/movies?title=potter"
