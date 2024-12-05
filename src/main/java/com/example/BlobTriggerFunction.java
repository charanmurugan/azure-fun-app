package com.example;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

public class BlobTriggerFunction {
    @FunctionName("blobTriggerFunction")
    public void run(
        @BlobTrigger(name = "content", path = "cnb-poc/{name}")
        String content,
        @BindingName("name") String filename,
        final ExecutionContext context
    ) {
        System.out.println("executed");
        context.getLogger().info("Blob triggered! Name: " + filename + ", Content: " + content);
        
    }
}
