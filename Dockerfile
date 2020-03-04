FROM vault:1.3.2 AS vault

FROM alpine:3.9

COPY --from=vault /bin/vault /usr/bin
