
## Extensões Essenciais

Instale estas extensões no VSCode (Ctrl+Shift+X):

1. Extension Pack for Java (Microsoft) - Pacote completo
- Instala automaticamente: Language Support, Debugger, Test Runner, Maven, Project Manager
2. IntelliCode - Autocomplete com IA
3. Gradle for Java (se usar Gradle)

### Configuração Recomendada

Crie um arquivo .vscode/settings.json na raiz do seu projeto:
```json
{
"[java]": {
    "editor.defaultFormatter": "redhat.java",
    "editor.formatOnSave": true,
    "editor.codeActionsOnSave": {
    "source.organizeImports": true
    }
},
"java.home": "/usr/lib/jvm/default-java",
"java.configuration.runtimes": [
    {
    "name": "JavaSE-21",
    "path": "/usr/lib/jvm/default-java"
    }
]
}
```

### Rodar/Testar Código

- Compilar: Clique no ícone ▶️ que aparece acima de `public static void main()`
- Terminal: `Ctrl + Shift + `` para abrir e rodar comandos:
```bash
javac empresa/src/Main.java
java -cp empresa/src Main
```

### Debug

Clique em Run and Debug (Ctrl+Shift+D), crie um arquivo .vscode/launch.json:
```json
{
"version": "0.2.0",
"configurations": [
    {
    "name": "Java Debug",
    "type": "java",
    "name": "Launch Current File",
    "request": "launch",
    "mainClass": "${file}",
    "cwd": "${workspaceFolder}"
    }
]
}
```

### Dicas

- Autocomplete: Digite e pressione Ctrl+Space
- Refatorar: Ctrl+Shift+R para renomear variáveis
- GoTo Definition: Ctrl+Click ou F12
- Quick Fix: Ctrl+. para sugestões

É bem similar ao IntelliJ.
