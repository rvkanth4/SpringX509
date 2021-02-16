package snippet;

public class Snippet {
	# Trust store that holds SSL certificates.
	server.ssl.trust-store=classpath:trustStore.jks
	# Password used to access the trust store.
	server.ssl.trust-store-password=changeit
	# Type of the trust store.
	server.ssl.trust-store-type=JKS
	# Whether client authentication is wanted ("want") or needed ("need").
	server.ssl.client-auth=need
}

