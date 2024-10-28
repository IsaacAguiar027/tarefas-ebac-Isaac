import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UrlTest {
    @Autowired
    private UrlController urlController;

    @MockBean
    private UrlService urlService;

    @Test
    void main_shouldExecuteWithoutError() {
        Url.main(new String[]{});
    }

    @Test
    void createShortUrl_shouldReturnShortUrlSuccessfully() {
        String originalUrl = "https://www.example.com";
        String shortUrl = "https://bit.ly/example";

        given(urlService.shortenUrl(originalUrl)).willReturn(shortUrl);

        ResponseEntity<String> response = urlController.createShortUrl(new UrlRequest(originalUrl));
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).isEqualTo(shortUrl);
    }

    @Test
    void redirectToOriginalUrl_shouldRedirectSuccessfully() {
        String shortUrl = "https://bit.ly/example";
        String originalUrl = "https://www.example.com";

        given(urlService.getOriginalUrl(shortUrl)).willReturn(originalUrl);

        ResponseEntity<Void> response = urlController.redirectToOriginalUrl(shortUrl);
        assertThat(response.getStatusCodeValue()).isEqualTo(302);
        assertThat(response.getHeaders().getLocation()).isEqualTo(URI.create(originalUrl));
    }

}