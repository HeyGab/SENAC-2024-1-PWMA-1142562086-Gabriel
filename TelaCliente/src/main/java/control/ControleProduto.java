/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.Produto;


public class ControleProduto {
    private  ArrayList<Produto> produtos;

    public ControleProduto() {
        produtos = new ArrayList<>();
    }

    public ControleProduto(String text, int cod, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cadastrarProduto(int cod, String nome, double preco, String marca, int quantidade) {
        Produto produtoli = new Produto(cod, nome, preco, marca, quantidade);
        produtos.add(produtoli);  
    }
    
    public void editarProduto(int codigoProduto, String nome, double preco, String marca, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCod() == codigoProduto) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setMarca(marca);
                produto.setQuantidade(quantidade);
                break;
            }
        }
    }

    public void excluirProduto(int codigoProduto) {
        produtos.removeIf(produto -> produto.getCod() == codigoProduto);
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void cadastrarProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
