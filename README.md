# Git Commands - [DOCS](https://git-scm.com/docs)

## Iniciar Repositório
***git init*** - Inside the code folder
## Conectar Repositório LOCAL com Rep. REMOTO
***git remote add origin https://www.123.com/repositorio.git*** - Connect remote and local repositories
## Enviar Alterações do Repositório LOCAL para Rep. REMOTO
***git push -u origin main*** - Send local files (branch main) to remote repository
## Enviar Alterações do Repositório REMOTO para Rep. LOCAL
***git pull*** - Bring remote files to local repository
## Status do Repositório
***git status*** - To check branch and files
## Atualizar Repositório LOCAL com branchs do Rep. REMOTO
***git fetch*** - Update remote branches to local
## Criar nova Branch e dar Checkout nela
***git checkout -b branch_name*** - Create and go to the new branch
## Pegar/Clonar Branch Específica do Repositório
***git clone https://www.123.com/repositorio.git --branch branch_name --single-branch*** - To
## Restaurar Arquivo
***git restore fileName*** - To restore last version of the file
## Exibe Últimos Commits
***git log*** - Show last commits
## Exibe Últimos Commits (detalhados)
***git reflog*** - Show last commits (detailed)
## Renomear Último Commit
***git commit --amend -m "new_description."*** - Rename last commit
## Renomear Último Commit (pelo editor)
***git commit --amend*** - Rename last commit (from editor)

***To exit: ESC + : + w + q***
## Desfazer Último Commit (get the commit hash from "git log")
### --soft (keep files tracked and added)
***git reset --soft ad5f41a6*** - Reset last commit
### --mixed (keep files tracked NOT added)
***git reset --mixed 32a1sd56*** - Rename last commit
### --hard (remove files tracked and added)
***git reset --hard df564b6*** - Rename last commit
## Lista o Último Commit de cada Branch
***git branch -v*** - Show all branch and the last commit of each one
## Mesclar Branches
***git merge branch_name*** - Merge the remote branch (branch_name) in the current one
## Deletar Branch
***git branch -d branch_name*** - Delete branch






