package com.ricardoostette.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardoostette.workshopmongo.domain.Post;
import com.ricardoostette.workshopmongo.repository.PostRepository;
import com.ricardoostette.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository PostRepository;

	public Post findById(String id) {
		Optional<Post> obj = PostRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
