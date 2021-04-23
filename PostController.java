package hu.HT.harmadikbeadando;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import hu.HT.harmadikbeadando.PostService;
import hu.HT.harmadikbeadando.PostDto;
import java.util.Collection;
import java.util.stream.Collectors;

@ResponseBody
@Controller
@RequestMapping("/harmadikBeadando")
@RequiredArgsConstructor

public class PostController {

    private final PostService postService;


    @PostMapping("/posting")
    public void posting (@RequestBody PostDto dto) {

        postService.posting(
                PostDto.builder()
                        .sText(dto.sText)
                        .sReverse(dto.sReverse)
                        .build()
        );


    }
}


