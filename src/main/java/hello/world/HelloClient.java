package hello.world;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;
import io.reactivex.Single;

@Client("/hello")
public interface HelloClient {
    @Get("/index")
    Single<String> hello();
}
