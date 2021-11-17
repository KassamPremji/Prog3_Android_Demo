package org.premji.service;

import org.premji.modele.ElementContenu;
import org.premji.modele.Post;
import org.premji.modele.Reponse;

import java.util.List;

public interface Service
{
    void creerPost(Post post);

    void creerReponse(Reponse reponse);

    List<Post> tousLesPost();

    List<Reponse> reponsesPourPost(ElementContenu elt);
}

