package builderpattern.example_buildpattern;

public class Address {
    private final String protocol;
    private final String url;
    private final int port;
    private final String path;
    private final String description;

    private Address(Builder builder) {
        this.protocol = builder.protocol;
        this.url = builder.url;
        this.port = builder.port;
        this.path = builder.path;
        this.description = builder.description;
    }

    public static class Builder {
        private String protocol;
        private String url;
        private int port;
        private String path;
        private String description;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }
}
