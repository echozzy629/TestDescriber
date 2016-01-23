

1) "participant-results" contains, for each participant the target Classes (the class with
   bugs and fixed by each participant) and the Test Cases they modified.

2) "Rowdata-RQs" contains, for each participant and for each task
    the achieved scores (e.g., bug fixed, structural coverage and mutation score). 
	
3) "Survey-results" contains:
    a) "Survey.pdf" which contains the pdf version of the online survey performed by the
    	participants.
    b) ”survey-analysis-generic-questions.xlsx" contains aggregated data of survey 
	questionnaire answers, as well as plots used in the paper.

4) ”working-dataset” contains the workspaces we gave to the participants for performing
   the tasks.
   a) 	“workspace-original” contains the original java projects we selected for our experiment;
	in this case the target classes do not contain bugs.
   b) 	“workspace-with-bugs” contains the original java projects we used in our experiment;
	in this case each target classe contains 5 seeded bugs.
