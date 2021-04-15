# language: pt

Funcionalidade: Teste de Login

Como um usuário
Gostaria de fazer login
na página web

Cenário: Deve logar na pagina
Dado que estou acessando a página web
Quando informo o usuário "vitorqa@outlook.com"
E a senha "teste123_"
E seleciono entrar
Então visualizo a página inicial

Funcionalidade: Problema de Login

Como um usuário
digito o email errado

Cenário: Não consegue logar na página
Dado que estou acessando a página web
Quando informo o usuário "vitorqaa@outlook.com"
E a senha "teste123_"
E seleciono entrar
Então aparece o erro, login ou senha invalida

Funcionalidade: Problema de Senha

Como um usuário
digito a senha errada

Cenário: Não consegue logar na página
Dado que estou acessando a página web
Quando informo o usuário "vitorqa@outlook.com"
E a senha "teste1223_"
E seleciono entrar
Então aparece o erro, login ou senha invalida
