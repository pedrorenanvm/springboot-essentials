# springboot-essentials

# Repositório voltado para o curso Spring Boot 2 Essentials DevDojo Academy

- Quando a tabela no banco é do tipo InnoDB, verificamos utilizando no console do mysql o show tables status e a enginee e do tipo InnoDB
- quando temos uma situação que precisamos checar se as coisas que estão sendo feitas precisam de ROLLBACK em caso de exerceção
- Quando temos algum tipo de problema no método save da service e ele precisasse lançar uma exception caso o objeto não fosse salvo e ele dá a execeção e ainda assim salva
o objeto, precisamos anotar esse método com a @Transactional, agora o spring não vai commitar essa transação enquanto o método não for finalizado.