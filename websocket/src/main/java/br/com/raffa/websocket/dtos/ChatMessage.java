package br.com.raffa.websocket.dtos;

import br.com.raffa.websocket.data.User;

public record ChatMessage(User from, User to, String text) {
}
