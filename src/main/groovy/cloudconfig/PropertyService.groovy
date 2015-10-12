package cloudconfig

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@Component
@RefreshScope
public class PropertyService {

	@Value('${name}')
	String name
	
	String prop() {
		name
	}

}