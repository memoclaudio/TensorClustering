# TensorClustering

The program solves the clustering problem using ALS algorithm. It uses the CPLEX [Mixed Integer Programming (MIP)](http://www.ibm.com/support/knowledgecenter/ko/SSSA5P_12.6.1/ilog.odms.cplex.help/CPLEX/UsrMan/topics/discr_optim/mip/01_mip_title_synopsis.html) solver to solve the optimization problem at each ALS iteration.

![equation](http://162.243.212.184/varia/clustTens.png)

The following dependencies (not provided in the jar file) are needed:
- [Jama](http://math.nist.gov/javanumerics/jama/Jama-1.0.3.jar)
- [CPLEX](https://www-01.ibm.com/software/commerce/optimization/cplex-optimizer/)
- [HyperDrive](https://github.com/adamierymenko/hyperdrive/blob/master/hyperdrive.jar)
- [Apache Commons Lang](http://apache.belnet.be//commons/lang/binaries/commons-lang3-3.5-bin.tar.gz) 

JavaDoc is available here <a href="http://tinyurl.com/stamile/tCluster/doc/" target="_blank">here</a>
