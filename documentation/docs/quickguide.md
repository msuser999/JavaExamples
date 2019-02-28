# Links to full guides
> [www.mkdocs.org](https://www.mkdocs.org/)  
> [Syntax guide](https://daringfireball.net/projects/markdown/basics)


## MkDocs

- __New project__
> mkdocs new projectname
- __Start server__
> mkdocs serve  
> [localhost:8000](http://localhost:8000)
- __Build HTML page__
> mkdocs build
> Files get placed in __projectname/site__

Define page links, names, in __mkdocs.yml__  
In __/docs/__ folder, place pages, __.md__ file format

	/mkdocs/projectname/		
		mkdocs.yml		
		docs/			
			index.md			
			about.md
			user-guide/getting-started.md		
	
URLs for the .md pages above:  

	/	
	/index/
	/user-guide/getting-started
	
		
## Syntax
Add two spaces after a line for a linebreak  

__HEADERS__

	# = H1
	## = H2
	### = H3 (h1 is the largest)	note: on this page "Links to full guides", "Syntax", are headers 

__TEXT BLOCKS__

Tabulate the lines that you want in a block

	this is
	a text block

__BLOCKQUOTES__
> This is the first level of quoting.
>
> > This is nested blockquote.
>
> Back to the first level.

Above written in .md as:

	> 1st level   
	>> nested quote  
	> back to 1st level

__LISTS__

- Red
- Green

	is written as:

		- Red
		- Green
		NOTE - = + = *, so 1st line can be "+ Red" or "* Red"

- List title
> List quote

		- List title
		> List quote


__LINKS__

	[Link text](URL)

__OTHER TEXT RELATED SYNTAX__  

use backslash (\\) to generate literal characters










