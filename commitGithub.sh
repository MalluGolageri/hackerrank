
commitToGithub(){
git init;
git add .;
echo "enter commit message";
read commitMessage;
git commit -m $commitMessage;
enter "remote repository URL";
read remoteRepositoryUrl;
git remote add origin $remoteRepositoryUrl;


    read -p "do you want to set new remote to the above entered url? Y/Yes or N/No?" option;
    case $option in 
        [Yy][YES][yes] ) git remote -v; break;;
        [Nn][NnOo] ) break;;
        * ) echo "Please answer yes or no.";;
    esac

echo "pushing to master";
git push -u origin master
}

commitToGithub();