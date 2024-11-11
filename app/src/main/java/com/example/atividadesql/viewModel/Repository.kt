package com.example.atividadesql.viewModel

import com.example.atividadesql.roomDB.Pessoa
import com.example.atividadesql.roomDB.PessoaDataBase

class Repository(private val db : PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoas(): List<Pessoa>{
        return db.pessoaDao().getAllPessoas()
    }
}
