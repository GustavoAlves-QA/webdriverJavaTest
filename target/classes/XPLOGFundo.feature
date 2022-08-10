  # language: pt
  @integrado @XPLOGFundo @teste

    Funcionalidade:


    Contexto:
      Dado que o usuario esta no site da Vortx
      E clicar na opção investidor
      E clicar na opção Fundos de Investimento


      Cenario:Validar tabela do fundo - XP LOG (Primeiro investimento)
      Quando escolher o Fundo XP LOG
      Então deve visualizar a tabela do fundo XP LOG


      Cenario: Validar download do segundo arquivo - FII-XP LOG
        E escolher o Fundo XP LOG
        E clicar na aba Documentos
        E clicar em Assembleias da aba documentos
        Quando Clicar em  XP Leroy Quarta


      Cenario: Validar o botão cota para consulta de fundo
        E escolher o Fundo XP LOG
        E clicar no botao Cota
        E escolher Dia 7 como data de inicio
        E escolher Dia 8 como data final
        Quando clicar em atualizar
        Então vai visualizar o Fundo XP LOG


