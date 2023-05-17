package pl.edu.agh.kis;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {

    }

    public void testMain() {
        //  HelloWorld.sh
        String test1 = "#!/bin/bash\n" +
                "echo \"Hello, World!\"\n";
        Main.run.operate(test1);
        assertEquals("Write-Output \"Hello, World!\"\n"
                , Main.run.operate(test1));

        //  PipelineExample.sh
        String test2 = "#!/bin/bash\n" +
                "ls\n" +
                "cd \"../\"\n" +
                "ls\n" +
                "# Temporary comment\n";
        assertEquals("Get-ChildItem\n" +
                        "Set-Location \"../\"\n" +
                        "Get-ChildItem\n"
                , Main.run.operate(test2));

        //  ReadUserInput.sh
        String test3 = "#!/bin/bash\n" +
                "echo \"What is your name?\"\n" +
                "read -r name\n" +
                "echo \"Hello, $name!\"\n";
        assertEquals("Write-Output \"What is your name?\"\n" +
                        "$name = Get-Content -Raw\n" +
                        "Write-Output \"Hello, $name!\"\n"
                , Main.run.operate(test3));

        //  WhileLoop.sh
        String test4 = "#!/bin/bash\n" +
                "counter=1\n" +
                "while [ $counter -le 5 ]; do\n" +
                "    echo \"Counter: $counter\"\n" +
                "    ((counter++))\n" +
                "done\n";
        assertEquals(""
                , Main.run.operate(test4));

        //  CommandLineArguments.sh
        String test5 = "#!/bin/bash\n" +
                "echo \"First argument: $1\"\n" +
                "echo -n \"Second argument: $2\"\n" +
                "echo \"help\"\n" +
                "echo \"BA AB BA AB\"\n";
        assertEquals("Write-Output \"First argument: $args[1 - 1]\"\n" +
                "Write-Output -NoNewline \"Second argument: $args[2 - 1]\"\n" +
                "Write-Output \"help\"\n" +
                "Write-Output \"BA AB BA AB\"\n"
                , Main.run.operate(test5));
    }
}