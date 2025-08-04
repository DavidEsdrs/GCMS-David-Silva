package com.example.WebApp;
import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, World!")));
	}

	@Test
	public void shouldReturnDavidMessage() throws Exception {
		this.mockMvc.perform(get("/david"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, David!")));
	}

	@Test
	public void shouldReturnOutro() throws Exception {
		this.mockMvc.perform(get("/outro-endpoint"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Outro...")));
	}
	
	@Test
	public void shouldReturnCode() throws Exception {
		this.mockMvc.perform(get("/code-endpoint"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("code...")));
	}
}




