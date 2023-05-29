#!/bin/bash
while [ "$1" == 1 ] ; do
    case "$1" in
        asdas )
            echo "Test 1" ;
            if ((1 ==2 && 1+1==8)) && ((""=""))
            then
                #q="avb"
                case $q in
                    a)
                        for asd in {1..6}
                        do
                            echo $asd
                        done


                    ;;
                esac
            fi
        ;;
    esac
done
man bash -u | grep "between x and y" | cat