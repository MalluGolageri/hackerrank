commitToGithub(){
git init;
git add .;
echo "enter commit message";
read commitMessage;
echo "commit Message:$commitMessage"
git commit -m "$commitMessage";
echo "enter remote repository URL";
read remoteRepositoryUrl;
git remote add origin $remoteRepositoryUrl;

read -p "do you want to set new remote to the above entered url? Y/Yes or N/No?" option;
case $option in 
        [Yy] ) git remote -v; echo "New remote repository set"; break;;
        [Nn]) break;;
        * ) echo "Please answer yes or no.";;
esac

echo "pushing to master ";
git push -u origin master

}

commitToGithub;