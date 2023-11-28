package br.com.raffa.websocket.events;

public record Event<T>(EventType type, T payload) {
}
