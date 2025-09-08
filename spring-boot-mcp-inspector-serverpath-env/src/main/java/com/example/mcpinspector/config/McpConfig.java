package com.example.mcpinspector.config;

import org.springframework.ai.mcp.client.McpClient;
import org.springframework.ai.mcp.client.stdio.StdioMcpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfig {

    private final McpServerProperties props;

    public McpConfig(McpServerProperties props) {
        this.props = props;
    }

    @Bean
    public McpClient mcpClient() {
        return new StdioMcpClient("java", "-jar", props.getJarPath());
    }
}
