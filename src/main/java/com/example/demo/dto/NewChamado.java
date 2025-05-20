package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.entity.Chamado.Situacao;
import com.example.demo.model.entity.Profile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// CLASSE (RECORD OU STRUCT) QUE NÃO POSSUI LÓGICA DE NEGÓCIO
// E É USADA PARA "CARREGAR" OU "TRANSFERIR" DADOS ENTRE CAMADAS
// É CHAMADO DTO: 
// Data Transfer Object -> Objeto de Transferência de Dados
public record NewChamado (
        @NotNull(message = "A acao é obrigatória")
        @NotBlank(message = "A acao não pode ser vazia")
        String acao,
        @NotNull(message = "O objeto é obrigatório")
        @NotBlank(message = "O objeto não pode ser vazio")
        String objeto,
        @NotNull(message = "O detalhamento é obrigatório")
        @NotBlank(message = "O detalhamento não pode ser vazio")
        String detalhamento,
        Situacao situacao

)  {

}