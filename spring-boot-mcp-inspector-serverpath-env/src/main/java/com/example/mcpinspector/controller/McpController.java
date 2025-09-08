package com.example.mcpinspector.controller;

import org.springframework.ai.mcp.client.McpClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McpController {

    private final McpClient client;

    public McpController(McpClient client) {
        this.client = client;
    }

    @GetMapping("/mcp/tools")
    public Object tools() {
        return client.listTools();
    }

    @GetMapping("/mcp/resources")
    public Object resources() {
        return client.listResources();
    }

    @GetMapping("/mcp/prompts")
    public Object prompts() {
        return client.listPrompts();
    }
}
