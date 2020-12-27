/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.article;

/**
 *
 * @author karim
 */
public class Lot extends Article {
    private int nbArticles;
    private int reduction;
    private ArticleUnitaire article;
    
    public Lot(String ref, ArticleUnitaire article, int nbArticles, int reduction) {
        super(ref);
        this.nbArticles = nbArticles;
        this.reduction = reduction;
        this.article = article;
    }
    
    @Override
    public String getNom() {
        return "Lot de " + this.nbArticles + " " + this.article.getNom();
    }
    
    @Override
    public int getPrix() {
        double totalReduction = (100 - this.reduction) / (double) 100;
        return (int) (this.article.getPrix() * this.nbArticles * totalReduction);
    }
    
    public int getNbArticles() {
        return this.nbArticles;
    }

    public int getReduction() {
        return reduction;
    }
    
    public ArticleUnitaire getArticle() {
        return article;
    }
    
    public void setNbArticles(int nbArticles) {
        this.nbArticles = nbArticles;
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public void setArticle(ArticleUnitaire article) {
        this.article = article;
    }    
}
