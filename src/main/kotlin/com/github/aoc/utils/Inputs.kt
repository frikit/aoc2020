package com.github.aoc.utils

sealed class Inputs {
    abstract fun getInput(): String
}

/**
 * DAY 1 PROBLEM 1
 */
object InputDay1Problem1 : Inputs() {
    override fun getInput(): String {
        return """
            1539
            1914
            1866
            1407
            1706
            1423
            1834
            1700
            1573
            1486
            1743
            1394
            1693
            1705
            1530
            1811
            1626
            1473
            1901
            1481
            1527
            1841
            1891
            1750
            1343
            1899
            401
            1896
            1627
            1593
            1541
            874
            1484
            1210
            1692
            1963
            1964
            1780
            671
            1862
            1393
            1309
            1740
            1831
            1932
            1185
            1979
            1504
            1663
            1610
            1494
            1511
            1103
            1738
            1816
            1871
            1545
            1595
            1784
            1412
            1815
            1998
            1783
            1770
            1426
            1699
            1416
            1880
            1612
            1989
            1360
            1869
            1762
            1690
            1999
            1990
            1521
            1730
            703
            1463
            1670
            1472
            1413
            1669
            1502
            1548
            1475
            1694
            1314
            1980
            980
            1667
            890
            1569
            1456
            1406
            1924
            1973
            1965
            1533
            1827
            2000
            1847
            1520
            1729
            1512
            1555
            1566
            1505
            1672
            1169
            1835
            1850
            1493
            1861
            1288
            1675
            1676
            1556
            1320
            1757
            1870
            1642
            1903
            1372
            1967
            1894
            176
            1908
            1418
            1535
            1487
            1496
            1491
            1611
            1970
            1758
            1563
            1766
            1629
            1937
            1763
            1829
            1772
            1632
            1517
            1736
            1971
            1721
            1716
            1429
            1408
            1560
            1958
            1359
            1890
            1825
            1536
            1819
            1697
            1887
            1832
            2005
            892
            1471
            1425
            1677
            1673
            1128
            1878
            1062
            1470
            1875
            1854
            1518
            1568
            1919
            256
            1532
            1711
            1944
            1344
            1330
            1636
            1957
            1709
            1551
            1983
            1674
            1671
            1959
            1760
            1689
            1767
            1477
            1589
            1897
            1144
            1982
            1544
        """.trimIndent()
    }
}

/**
 * DAY 1 PROBLEM 2
 */
object InputDay1Problem2 : Inputs() {
    override fun getInput(): String {
        return """
            1539
            1914
            1866
            1407
            1706
            1423
            1834
            1700
            1573
            1486
            1743
            1394
            1693
            1705
            1530
            1811
            1626
            1473
            1901
            1481
            1527
            1841
            1891
            1750
            1343
            1899
            401
            1896
            1627
            1593
            1541
            874
            1484
            1210
            1692
            1963
            1964
            1780
            671
            1862
            1393
            1309
            1740
            1831
            1932
            1185
            1979
            1504
            1663
            1610
            1494
            1511
            1103
            1738
            1816
            1871
            1545
            1595
            1784
            1412
            1815
            1998
            1783
            1770
            1426
            1699
            1416
            1880
            1612
            1989
            1360
            1869
            1762
            1690
            1999
            1990
            1521
            1730
            703
            1463
            1670
            1472
            1413
            1669
            1502
            1548
            1475
            1694
            1314
            1980
            980
            1667
            890
            1569
            1456
            1406
            1924
            1973
            1965
            1533
            1827
            2000
            1847
            1520
            1729
            1512
            1555
            1566
            1505
            1672
            1169
            1835
            1850
            1493
            1861
            1288
            1675
            1676
            1556
            1320
            1757
            1870
            1642
            1903
            1372
            1967
            1894
            176
            1908
            1418
            1535
            1487
            1496
            1491
            1611
            1970
            1758
            1563
            1766
            1629
            1937
            1763
            1829
            1772
            1632
            1517
            1736
            1971
            1721
            1716
            1429
            1408
            1560
            1958
            1359
            1890
            1825
            1536
            1819
            1697
            1887
            1832
            2005
            892
            1471
            1425
            1677
            1673
            1128
            1878
            1062
            1470
            1875
            1854
            1518
            1568
            1919
            256
            1532
            1711
            1944
            1344
            1330
            1636
            1957
            1709
            1551
            1983
            1674
            1671
            1959
            1760
            1689
            1767
            1477
            1589
            1897
            1144
            1982
            1544
        """.trimIndent()
    }
}

/**
 * DAY 2 PROBLEM 1
 */
object InputDay2Problem1 : Inputs() {
    override fun getInput(): String {
        return """
            3-4 j: tjjj
            7-10 h: nhhhhhgghphhh
            7-13 j: tpscbbstbdjsjbtcpj
            4-13 l: ckllmqzlvcsxpplqg
            3-11 n: nnrhnnnnnnnwsdnnnm
            5-6 d: ddddddb
            7-10 z: szfwzrbzzz
            1-10 w: wwwwwcwwwrpnwzwxww
            5-6 w: cgwppfwlwrwtnw
            12-13 m: bmmthmmhmmmbmmmmm
            1-4 b: gbbj
            10-14 k: kkkkkkkkkfkkkzk
            1-3 n: nndn
            3-4 w: wwpf
            15-16 q: qqqqqqqqqqqqrqqqq
            3-4 w: wwcg
            10-12 r: rrrrrrrrrcrrrr
            10-11 v: fvlvrvcxvvp
            4-11 l: qdklwltggdcqn
            2-4 p: ppskptpp
            3-8 r: rjrrgrrk
            5-9 g: mgglggggrggggggxkggw
            9-16 n: njnnnnsnrnnnnnnhnnnn
            4-5 v: fgjvvxtqdmtqhnd
            2-11 r: rrfbltcxmqm
            4-7 q: hdkqfsq
            2-4 s: smshsswsztsmgssssss
            8-9 m: mmmmmmmlwm
            2-9 x: xxxxxxxxpxxxxxx
            3-4 d: zdgddd
            16-18 q: qqqqqqqqqqqqqqqbqj
            2-12 s: ssssmssssssssss
            8-9 q: dnztqqjqq
            1-3 d: ddddddddd
            2-10 h: hhhhhnhhvhhbhhhhhh
            8-11 l: wpjmvxqlmqllprw
            3-14 w: wwwwwwhwwwwwwpwwwwwf
            2-3 m: dlggmnlr
            1-6 b: bbbbblbbbbb
            1-10 c: ccbhdccdhltc
            2-11 g: cgrggfsgggggj
            10-15 t: ksnnwcqxcpzsvtcvtwm
            6-7 s: ssssssps
            17-18 j: wpjjjjjjjmjjjjcjjj
            7-8 m: cmqmmmlz
            3-4 m: mqmm
            3-10 h: dfhkkztbmhvcjvh
            7-16 x: rqwfvspqcxmpxnwxbd
            2-4 b: wfbbbfnj
            1-3 j: jjjj
            7-8 m: mmmmmmtw
            14-15 p: kpppwppppppppdppqp
            7-19 d: dddqrdkcgxxxdddddrdc
            1-6 l: cnlgtlc
            2-6 f: nfffffvfffqfrf
            11-15 s: sssssswsscsqbjdss
            6-14 s: sssfsssmsssssbsrnsh
            6-7 c: fcnppcc
            4-14 n: rshnnldbsnwvnwnnqnwn
            2-4 c: lcccrghcqwvc
            9-15 b: bgvjbclttvbqprb
            5-10 l: hlllqldgllnpttxqllrl
            8-18 h: hbhjknpnhvhpsbvsrdmh
            5-9 d: dddddddddd
            6-7 x: xxxxxxqd
            6-17 x: xntqxxxxxxxxxnwqnn
            10-19 f: fffjfffzfflhnfrsffq
            5-8 b: bbjfzdbhbb
            2-3 j: jljl
            16-17 s: swvsvsszsshssksssrn
            3-8 t: vtmhjrbx
            7-11 p: kpppppppppppppp
            3-4 j: wjjjk
            9-10 b: lbbpbbbbvb
            4-9 l: jrlbmrthlbjlmpgf
            5-7 g: vggggbwxgslgj
            11-17 f: gfmjfffdzfmvffpqff
            6-11 t: nbbbttmhbtwt
            6-7 p: jpprgnspppf
            6-7 w: wwwwwjwq
            8-11 g: zggggggchglqgggg
            15-16 x: xcxxxxbbxxxxxxxb
            2-16 d: xmnpfhvqnxcqdrgcw
            8-9 d: fdskddfwlddb
            3-9 x: xxxxxxxxs
            2-6 p: pppppbppps
            3-6 t: bjtptj
            18-19 w: qwwwwwwwwwwwwwwwwwww
            6-15 n: nkfndnxwzfjsvhnp
            3-4 v: lnvv
            7-13 v: mvvvvvbbvvvvmvv
            4-6 d: ddddds
            4-8 b: ftpbnfbsblvbvhlhtlb
            3-4 g: fnkf
            1-4 x: xxxw
            1-8 r: rrrbxnsrqrrrrqrr
            13-14 z: zzzzcvzzzzzzzzzz
            4-9 x: zhtvxfbzxdvkn
            1-9 d: zdddddddddd
            10-12 g: lhhddwgnjjwz
            6-12 p: ptpwlppsrzphlppqpd
            11-16 f: pfnxnbsfbsfdbzrx
            11-14 r: mccfwbcpbhrrlnvn
            10-14 w: wnwwwswtwwkwnw
            14-17 k: kkkkkkkkkkkwkwkkk
            7-9 g: kgkjktghg
            1-4 x: mxpxbjxxtvmw
            2-6 z: zzsswzr
            2-8 g: mcktgkkgqmcn
            8-19 n: znjnwhhnnwfdnhncwjdw
            3-4 k: pkgljmkdfhsxhpvwc
            7-13 m: mkpmmmqnmkmjrmcmm
            2-3 w: wvwcwxr
            19-20 q: qqqqqqqqqqqdqqqqqqmq
            5-6 r: rkqcrhs
            4-6 b: bbbbbq
            3-11 d: ddgddddddddd
            15-20 m: mmmmxmmbmrmmmfmmmmmm
            3-4 q: qhwq
            15-16 n: plzwngnnvzcnwknn
            4-11 l: ghlswpdrqvlsfj
            3-13 m: xdmvpmhktsmfm
            4-7 b: bbbbbbbbb
            4-10 w: mwwwgmgtwnwpbnw
            7-9 l: llllllpvlll
            3-11 z: zzdzzzzzzzzz
            3-4 h: hpnkhtz
            18-19 b: bbbbbbbbbbbbbbbbbbdb
            5-11 q: tqqqqbcqqqqdhq
            4-8 g: sgtgglgpgwjjj
            10-12 d: ddddddtkdcdr
            7-8 h: hhmhhhhh
            2-9 h: hrhvhhxhxghghh
            5-6 x: vxxxrh
            3-5 n: cgnfn
            17-18 z: bzzzzxtzcxzjvzzlzbn
            10-13 f: nfxwjfffffpfvffbvff
            1-3 p: pxpppp
            1-3 g: gqgbg
            9-10 v: vhfpwvvbvvfvvv
            3-7 r: rrsjrffrvwrrrr
            3-10 g: qlrrgglblwpjqccmw
            13-14 x: xxxxxxxxxxqxxx
            4-12 h: xrbkrnxjghkp
            13-14 s: xhsssswkssrsls
            6-8 r: rrrpgrrgrzr
            12-15 m: cmmmmmmmmmmmpmx
            2-8 l: wccfwrxl
            1-13 f: ffdfpdffffffffff
            10-12 d: dxdddddddddj
            9-18 b: ltnbbbmrfqbbbfbbgnd
            2-4 k: kbkklk
            7-8 n: nqmdncklnqnftjpvrcj
            6-7 s: ssssszshsss
            5-8 t: tttttsttttt
            11-19 k: hkvrktkkkkthrkvkkkkf
            3-5 x: qrxxbx
            11-12 d: ddddddddddzgd
            7-18 d: ndszddkddsdbdcqdddp
            7-8 t: ttttttttt
            2-4 s: gsksqskhjb
            9-13 d: dlqxsdddjdddg
            2-6 n: fgndtf
            6-11 s: sssssssnbsvss
            4-10 p: kjtpbjwpmb
            12-13 s: wssssssplsstscsszsds
            2-4 h: jthg
            1-2 z: zzzszhzzrvqz
            8-9 j: jjjjbjjncjj
            3-11 q: qvlqqqqqqqfqqqqqqqq
            8-15 w: pfqmwwwwqsccwgllm
            1-4 q: nqqhq
            7-16 k: kkkbktkkkjzhlkkkf
            4-11 s: kzjssthfsbtndfsd
            1-13 g: gbggljgggggggngggk
            1-9 q: qqqxlqvsmqg
            17-18 g: ggggggggggggggggfgg
            6-8 n: nnnnfsnrzksn
            2-4 k: zkhk
            10-12 n: gnfnnkknnnmnp
            1-3 j: jxnxw
            5-6 n: nbnknsjkmnh
            3-4 f: mkhf
            11-14 f: ptnpgkfzgzgxpk
            3-4 g: gwdj
            2-4 h: hhkh
            4-5 b: fvbzqx
            1-4 x: fxxp
            4-13 c: cccckcmtcccdccrcccc
            1-7 r: rrrrrrnrr
            9-12 g: rdhzhbspgxgccmmggg
            4-6 f: smfndrpscf
            2-6 j: jjjjjjj
            4-5 d: dddnzdd
            2-5 b: rbwgd
            4-6 s: sssssss
            3-6 d: dvnmjd
            10-14 x: xxxxxxxxxsxxxxx
            3-5 t: swttxctxf
            3-20 m: pxmlmzwzmjmnmnmcmmmr
            3-4 l: gdll
            9-13 h: kmhhhnznshhhhhsmhfx
            6-9 d: ghdlqfdmthdsjdcjht
            9-10 j: jdbqjjjjjjdjj
            4-7 q: qqvhbnqzxt
            5-18 b: mblpnblwlxjbxhqcmbl
            6-9 j: hjcwsvdgq
            9-16 t: kbtdksjcmmqpngdm
            6-9 z: zzzzzzzzzgzzzkzz
            18-19 x: xxfrxrgbbxpxxxxxxxqx
            4-5 b: nhbbz
            9-11 w: whwwwwhwwhwwww
            2-3 w: whww
            3-4 s: bsfsdgs
            5-7 k: kkkkhkwk
            5-9 f: ffxfffffqf
            4-5 z: bzzzggzjr
            14-17 n: nhjnxnnwxwvxnnlnv
            6-7 p: xpsklmg
            1-6 b: rbvblrkcblbbbb
            3-10 k: kkxkkkkkkck
            2-7 x: wxxdxgxtxqxxqxxxxx
            3-6 k: kwkfkznkkkq
            10-14 k: klqkksvskjkzmkkk
            2-6 p: wprgppgppszh
            4-5 b: bbbgbk
            8-16 b: kblbbbpvmjpbbfhhgbb
            6-7 g: hgdglzg
            3-7 g: lcgtgvl
            1-4 s: cssxs
            11-14 m: mhdpbnxqtpvfck
            11-20 b: bbbbbbbbkbnbbbwrbbbb
            1-3 l: lpcthzrgmmplrlxnbnw
            2-4 l: lbls
            11-12 h: thhhwhhhhhbf
            1-8 h: hhnlnhrc
            2-3 r: frpl
            8-12 p: ppppppkppnfpnspp
            6-14 f: fffffffcgrffffffk
            11-13 n: knnkrnkhvnvhsnhjmfb
            1-3 m: jmhjkk
            3-10 g: ggggggggggggggggggg
            6-8 m: mmhmmrtzrbgs
            14-15 c: nnvzfcvcrqcxbcw
            1-5 j: jjjjz
            1-15 r: rzjdmjjlfrbrmrrwlrr
            4-11 j: jjzfjjljnjjjjpj
            2-3 h: hhdh
            4-10 p: rppwqpppppp
            2-6 q: qqmwmqq
            10-19 t: dhjttjkspttxzbtxjmx
            10-11 r: rrhtjkdrrjl
            3-4 w: wwxwf
            4-17 n: ncsnlnnnnqnnnjnnqbc
            3-10 b: bnknbwbbbbb
            10-13 v: vvsfvjltvbwvvvnzv
            12-18 w: wwwwwwwnwwwfwwwwwww
            2-14 w: dwbmkgmqbqlcpwv
            1-9 r: rrrrrrrrkr
            1-5 f: ffflffffffff
            11-13 f: ftffffffffffgfff
            1-7 r: rwrrrrrrrr
            7-13 x: jthgxdmdxrbmvf
            5-6 r: wqdtqzrt
            4-13 d: kccfgmvknwbddrxmx
            9-18 x: xxxxxxxxcxxxxxxxxxx
            9-10 h: hhhhhhhvhhh
            8-16 v: gpblbxmvzhdrnjbrv
            6-10 t: ttttttttttttttttt
            5-9 k: slkkdtvhk
            4-5 f: ffpjq
            7-16 t: tktttttttttgtttttt
            4-7 k: kkkjkkdb
            3-4 q: qmvq
            2-7 b: whmfplbb
            16-17 p: pppppppppppppppppp
            5-7 h: hwphhngh
            4-5 w: kfjwlwcbhgz
            5-6 p: pxhppps
            17-18 k: pkmgdkdkckkvlrtnzj
            12-14 z: dkzzzzzztkmjzh
            6-9 d: ddddddddddjddddd
            1-6 v: vvvmvznvvbv
            1-8 b: bltbdzjb
            8-9 v: vvxvhvbvl
            8-15 m: mmmmmmmmmmmmmmvmm
            12-14 k: kkkkzkkkkkkkkk
            13-15 j: jjjjjjjjjjjjjsnj
            3-6 r: rrmrrrrr
            4-13 q: pqdrqqqqfhcqq
            2-7 b: lbzbkpbgvb
            5-9 h: hhmhrhhhhhhh
            4-5 h: hhfhb
            1-2 f: rfcjf
            4-12 f: gcffrbpvcnhvcrrj
            5-6 q: qcqrgs
            10-14 l: xcflwdwgbrqjwl
            13-16 v: qkvxzcltfsvmzgxqvt
            7-9 g: gggggggggg
            17-18 c: ccbqmccwcccfccgccc
            2-6 k: lkkkkwkk
            3-12 v: rqvqkhwxsrvv
            9-10 s: ssssqsksssss
            5-6 j: jjjjzj
            6-7 m: jnvpssgqtczz
            2-15 d: hdjhrksnlsbxdjdwvf
            11-18 m: mmmmmmmmmmzmmmmmmmmm
            5-6 m: mrdjgl
            3-10 h: xthspkwhjhltlcrds
            2-15 p: pbpppppdpppppppppkpp
            1-5 n: nznwn
            8-14 h: zghhhhghkzhllj
            15-19 v: vvvvvvvvhvvvxvvvvvg
            3-5 p: ppzpsbpp
            2-5 b: bwkdrdpkrtjdv
            8-12 x: qlxxxxvxxxsxgx
            2-10 z: zzzzzzzzzz
            2-13 w: bfvwhwwwpwbwwm
            8-10 p: pppppxpppc
            13-14 h: hthhhhhhthhhhzh
            5-7 l: llllccw
            3-4 w: wwww
            2-14 m: mnmmmmmmmmmmmgm
            2-5 j: jjjzbjj
            1-4 r: xrrwr
            6-12 f: fphbffwmffnzf
            1-5 z: pzkszsjzkdqxgzknrd
            5-10 b: bbbbbkbbkb
            9-11 d: dxrpkjhrddl
            5-11 n: bnlnnhqjbbn
            10-15 g: gggggggggwggggbggg
            4-9 q: jqqmqdqxfq
            6-9 q: lfcbxpqgqc
            7-13 j: jdcjjmjwfrjnnr
            1-13 g: xgggggggggggcggg
            10-11 d: ddvdxdmdddk
            4-6 n: nnnxnt
            5-7 n: hnjnnfnfpnrdntrh
            3-8 b: bgbrffxlbrbbb
            9-13 z: fdhdzzznzxzgj
            2-7 r: rqrgblk
            10-14 j: jxkjpjbjjjjjjsggjpp
            3-4 m: mmmm
            5-6 m: mmmmmmmm
            3-8 k: lvkvqcgkzkdcptc
            7-13 g: glbnggkbzkghgmg
            5-8 d: dddddddcd
            4-5 l: llllh
            5-15 w: wrwwwwwwwwwwwwwwqwww
            14-16 p: ppzppppptdpppsppppp
            8-12 p: ppxpppvppppkk
            15-17 x: xxkxxrkxxxxfpxxxx
            12-15 s: ssssscsssvssssgcs
            4-6 p: pppppp
            3-4 j: gjjjjwwj
            3-5 f: mfwhfpk
            16-18 p: pppppppppppppppxpmp
            1-2 m: mnmcrmq
            10-19 t: bttttttbtttttttttttt
            1-13 z: qzzzzzzzzzzzzz
            11-17 w: zpdsdfmhgmvcvzkdwpw
            5-7 z: zzzlfzgzz
            8-15 d: dddddddpddrdqgt
            2-3 k: nkjkk
            11-12 q: qmqqqqqqqgnnfqkqc
            1-2 p: pgpp
            5-6 b: fnbzbb
            11-12 z: zpzzczkzzrpszzzzt
            13-14 t: ttttttttttwttqtt
            4-6 p: phpfpp
            2-3 f: fvfws
            6-7 f: fffflfdff
            8-9 q: cwpqcqzqpf
            5-7 p: spppjpkpc
            4-11 s: sgsssdbbhpkssd
            1-6 s: wsssspsfsss
            1-3 m: mdmmmmmm
            4-6 d: dtdtmdg
            1-3 w: wwzwpww
            10-11 l: tlmhlllnqllb
            12-17 m: mmmmmmmmzmmtwmmmg
            3-4 c: cctkcc
            13-14 b: bsbbbbbbbbbbglb
            6-7 w: wwwwwxd
            1-11 j: kjjjxkjjrqj
            5-8 z: zbvjzzzz
            1-5 k: gkbktk
            11-13 k: kkkkkzpmkkkkm
            10-11 z: wtpfvmmpqhg
            2-3 s: bssc
            8-17 h: hhhhhhhxhhhhhhhjhh
            6-9 l: lllllmllll
            5-9 l: llllllglll
            2-7 q: qkqdsqm
            6-8 s: ssssssjtds
            7-8 c: ctfdfmccjhvrc
            4-5 w: gqcdwcwktmm
            4-13 b: wwjbnmghbjkwzbbj
            1-9 r: qbprwrrmsrr
            3-4 c: kcscl
            3-4 d: jdqd
            2-7 p: xpzmbfpvpjg
            2-4 f: fnfq
            7-8 b: wjdqkbbb
            13-15 m: mmmmmmpmmfmmgmxmmmm
            4-5 c: mpclj
            9-10 x: txxxxdpxql
            1-5 c: gccjcc
            2-8 k: xzkqkhvk
            9-11 k: kkkkckkkgkkpkvk
            10-14 x: mxzxrkdxgpxcxhxl
            5-6 z: hzzztz
            10-13 g: wzgggggvgggkl
            2-5 p: mmpvk
            2-4 b: stbsbbbbbb
            9-10 r: rrrgrrrrwqr
            1-6 z: xzzfzzv
            3-5 l: ljvlw
            2-8 f: lfqvjghd
            4-5 n: nnznn
            5-16 r: csmxrkrqnwnzzpprvr
            2-15 h: qhtmxhbgzzsbnjwwsqfl
            4-5 s: sfqps
            4-5 c: cqcgc
            12-13 d: dmcddddddddcdd
            3-4 s: xsqs
            14-15 j: jjjjjjjhjjjjjjj
            12-13 r: rcrsrrrrrrrrrrrr
            9-10 h: hhhfxjzvhxhbf
            3-5 w: qwvww
            4-9 b: bbbfbbbblbb
            15-17 b: kdlqpsrbrbbmbbbzbtz
            9-10 p: ppqppjppwjpp
            11-14 x: mbchwxxxxxxxxf
            2-3 t: stdnsv
            2-4 s: sbss
            7-9 k: kvkfkkqjk
            5-6 d: ddddldd
            1-12 g: cggggggggggqgggg
            8-10 b: bcvxgdzbbbbclbddmcpq
            1-3 p: qpppp
            3-10 g: mbggbzlwjgrqncddkbjz
            3-6 n: nnnnnnnnnnnn
            5-14 t: fdtqxdpztgrtzl
            7-9 p: ndppppzpppnb
            6-9 l: llxlmlldltllll
            2-8 p: pwvmbccpvhbqg
            2-5 q: bqccqlpj
            1-12 j: jjpddhjrjkjb
            2-16 j: hnmrxjcspnnrqhcj
            2-4 s: scrb
            3-11 j: jjjjjjjwjjc
            6-9 h: bhlsnhkfhnqhprpdm
            2-4 k: skcn
            10-15 r: prrbrrnrrrrrrvlrhr
            1-2 p: pppp
            3-5 t: ttqtttc
            1-2 k: kwkp
            6-7 g: gggggggfxgmgggggwg
            6-17 g: lvgggggnrwqnsggrgg
            2-8 v: qvmnvvvzn
            5-6 r: rrcmgrvrhrf
            6-7 w: cwwhwwq
            1-16 l: rllllllllllllllll
            14-16 v: vvvvvvvmvvvvvqvvvhv
            13-16 m: qmmmmmmmmmdmmmghmmmm
            10-13 x: xgxxbtbxgxxxdx
            6-7 k: kkvkqkwkkkkvkkkh
            16-18 g: ggggggggggggggggggg
            1-12 f: ffffffffffsmffn
            11-14 c: kmltgplwdccvzchtfs
            1-2 l: whll
            3-10 r: tchrjqrwnrnhlrzssdr
            1-4 b: jbxbrb
            9-10 d: dddddddddldd
            4-6 r: rwrrrrrlrchnqxv
            1-5 z: sjznb
            3-4 p: wqtp
            3-13 n: zncsfbdxpnpzn
            6-8 b: ppbzbvjhmfnq
            2-4 h: hhhr
            5-6 w: lwrgll
            10-15 l: lllllllllllllllll
            5-6 l: hltlllbwlr
            8-9 q: tpzqmqqssqqqqq
            12-17 v: bmxhqtvmrgvvgqzvp
            7-8 t: ttttttvtt
            11-12 r: rrbrrvrrnsrr
            2-5 f: wzrnlcxfhnchsrzjxl
            12-17 l: lllllllllrllllldl
            9-10 h: phhhhhhhrzhq
            5-17 q: chqkqpjqnqjlcvbxlqkq
            1-2 m: hbmm
            4-10 f: vtfffsbvsff
            5-10 h: hhhhhhhphnhhh
            2-3 x: xlxxxnxltdxbxdbxpg
            4-12 x: nlxxtcbbbknh
            2-3 l: llfll
            6-9 p: ppppppppp
            2-4 v: grwdv
            5-8 c: fkpkccdcvdvck
            2-8 l: khzlpwdcddk
            2-7 v: vlbvvbl
            7-8 h: zhhhhhnh
            12-14 p: phpxppkprhbpvpp
            5-6 j: jjjjcsj
            5-12 m: srctztgnwtrmmmwkjk
            5-6 s: ssslss
            2-3 m: mxmm
            10-13 c: ccccdcdcccchzlcw
            11-12 k: kkkwkkkkkkkkkk
            9-11 g: rfggsgphdhg
            8-13 w: wwxwwwzwfwwwtlww
            5-6 f: qvpfmt
            12-13 n: mlnntnnzblnnvnd
            7-8 q: qqqqqqbqqq
            4-7 p: hpnvfpmpgqp
            14-16 b: bbbxbbbbbbbbbtbdbvb
            16-19 g: gwgggcsgggpggjgjggj
            3-6 k: kkkptkkdrk
            1-7 l: slsrxllllw
            3-12 d: dddddddddddqdd
            5-6 m: vcwtmdmmmmxzm
            4-6 r: rtcfcz
            7-12 x: xxswxxhjxnxxxx
            6-7 t: ttswtkztt
            15-18 g: nggckgdmsvdrqlgcqz
            6-9 t: tttttstttlt
            16-20 f: fffffffffffffffffffl
            7-10 l: bcbdhwlslwlqx
            8-11 k: kkkmkkvksmktkskkxkmk
            9-15 h: rptgwtvxjgzqjrtqqc
            4-6 j: jjjjjjjjjj
            12-15 w: wwwwwwxwwwfwwxrw
            13-15 d: ddddddddmdcdcddddd
            13-14 v: vvvvvvvvvvvtxv
            10-12 f: fffffffffffvf
            7-10 j: jjlftzjmjz
            9-10 w: cwwzwwllwfwktqkwxr
            1-8 b: bbbbbbbvb
            11-14 d: dlsmbgcdxhxfnqdhzd
            17-18 k: kkkkkkkkkkkkktkkbq
            7-8 k: kfkpkkkkkk
            4-9 w: zbwwwrckwntbdqfd
            7-8 m: mmmwmmgm
            7-11 v: cvxllpvgdnh
            5-13 c: cmccqccjcccjc
            12-14 m: mmmmmmmmmmmmmvmmmp
            4-11 x: dgvxxptdgkxpxl
            4-5 f: pfclfffk
            7-14 l: lllwlwlqqsnmllllll
            10-11 l: pcqllllvlqlll
            2-5 k: kkbkk
            3-6 d: ddddddd
            8-9 d: dddddddld
            1-11 d: tddddddcddmdddd
            5-8 b: pljtbkwkxb
            11-12 t: tttttttktttgttt
            6-7 q: qtqqqqgq
            7-8 v: vvvbvpxp
            4-13 v: vvvpvrzvvvvvvvvvv
            8-11 r: rrrrrrrnrrr
            14-15 b: bbbbbbbbbbbbbzr
            13-16 p: ppppppppppppfpppp
            7-10 g: gfgqgglggg
            4-7 s: ssdsshc
            8-11 t: zttctgtvttfttcrxd
            11-12 j: jjjjjjjjjqwx
            1-6 w: wwwwwl
            4-7 l: zlbmrll
            2-10 k: kkkkkkkkkm
            8-10 x: xxxxxxxjxfx
            4-13 r: blrrkqjczlbnrfbbkd
            8-10 z: zzzzlzzzhj
            9-11 s: vsmsszsssvsqss
            3-6 m: mvkrmmwpzbtmmm
            1-5 r: smlrbr
            5-6 k: rlkklkkkkh
            2-5 d: dkddddddpd
            13-14 g: ggxtggfvgggdgggggcgg
            7-9 x: xxxxxxbxgxxx
            3-16 x: xxxxxxxxxxxxxxxlxx
            11-15 c: chvcccccccqccdm
            3-4 j: kjjjj
            9-10 d: ddddmddddd
            13-14 q: lqqbrqzbqqpcpt
            2-5 w: xgjsxww
            12-14 w: lwtxgwwzwlwbwwc
            3-4 r: hffl
            11-15 b: bbbbbbbbbbfbbbwb
            3-7 f: lffnkpfm
            6-13 v: vvvvvcvvvvvvvv
            7-11 v: vvvhmvvvjvvvvvvvh
            18-19 z: bzqtbfvfkxgzzxkftzz
            8-14 l: gptlllllllxgll
            7-10 w: dwmwrfwkkghf
            2-4 f: fffshfffff
            1-3 n: rnsfgn
            7-20 w: wwwwwwhwwwwwwwwwwwwg
            11-14 g: ggggggggggwggggkgg
            2-8 x: xtxxlxxmmcxllxtxwxx
            2-8 b: jbfclqjbkszckpkxnbn
            1-3 d: dhdhffmd
            14-19 b: bbbbbbbbbbbbbbbjbbbb
            6-8 d: dtjbzdsddddf
            14-16 n: rfmszmgztspnnncqj
            9-10 v: vvvvrvvvvnv
            5-6 r: rrsrrrrrrr
            6-7 v: vvjvvjrv
            6-8 q: tvqsqqvqqd
            1-3 q: qwtdqbgmmck
            8-15 p: ppppqppzjpppplpppppp
            6-12 m: mwmhmsjxgcmmcrzlmmkc
            2-8 j: sjwjljqjjjcdlmgxkjj
            12-15 j: sjjjjjjqjjjjjjkjjj
            14-15 t: vtttttttttttttt
            17-18 r: rrrrrrrrrrrrrprrhd
            10-15 c: sxspsvqkfvqjjccxbbv
            7-8 g: ggggggxg
            2-12 t: tbtttttttntmttttt
            3-6 m: ztjrds
            2-4 h: gdzk
            4-5 p: rtlkkfwntpxw
            8-14 k: kkkkkckkkkkkkgkkk
            3-8 l: rqltzlflljsqmk
            9-10 s: smssswksjsssss
            12-13 z: zzzzzzzzzzzzr
            12-14 h: zhhhqvhhhhxhhh
            13-14 x: xxxxxxxfsxqqsxxxx
            2-3 k: kffk
            1-5 z: jzzzzzzz
            10-15 n: nngnnhnjnnknndnvtbsd
            12-13 k: dkkkkkkkkkkkn
            6-8 h: qhfnrpfh
            7-11 c: ccccccqccccc
            19-20 m: cjbpwtmdfbllvvdrmmmt
            5-6 l: lmrbhtbl
            3-6 j: hjjkjm
            9-10 j: jjjjjjjjtljxjj
            3-5 t: ttbtcttt
            5-8 r: rrrrrwhfrrf
            3-5 d: dqvknd
            5-7 j: jtjjgjm
            5-7 v: vdjrlwv
            8-9 s: ssssqsssssssxssssss
            12-16 q: qxkjsjlsggcqhplq
            16-17 j: jbftlzjjhjjjjvhjjj
            3-14 v: gppvmdbvfwvgnd
            1-8 b: bbbbbbbdb
            2-6 z: pzwhjdzpxwt
            5-9 v: qvrvmdvhwv
            2-3 b: bbhlpxtbxzx
            4-5 z: zzhpzz
            15-20 f: fgzfnbcgtbnmflffqfrv
            4-5 t: ztxttc
            6-11 p: mjppkpcrdflpwqjrwprp
            4-7 h: khdwwhhrhhnchs
            10-11 b: mprbbblmcbbxqbbbbc
            4-6 c: cccjcccx
            1-4 r: nrrhrrr
            1-2 d: dddlk
            19-20 f: bfffffffffffffffffkb
            4-6 w: wlswkwwrdsjtwbww
            2-3 d: ddld
            9-14 r: rrrrrrrrmrgrrjrrr
            10-11 k: kkqkkkkkkjk
            2-5 k: rkkkkxkkkvsd
            16-17 b: bbbjbbbbbbbblbbbrbb
            6-7 k: kkkkkkk
            7-11 v: lfpjgrrvchvjfdt
            12-13 g: fgxqnkgstgpggvrqdl
            11-13 d: ddmmdtdddddhddd
            6-7 g: mpstgwggbx
            11-14 h: hhhhhhhhhhqhhbh
            18-20 d: dddddmdddddddddddddh
            10-12 m: mmmmqmmmmmrxwmmq
            2-13 d: rxnxstxxrjvbdd
            3-4 z: drzlrz
            5-6 d: qddddb
            3-7 d: ddzjcmvtkfdjplhllfn
            10-15 m: wdxhmwbnmmmtrxpcj
            7-8 b: bbkjbbgnbbswd
            2-3 b: bbbhz
            1-10 p: gpppqpppgppppppp
            10-11 w: zwwfbwdqzww
            10-11 n: nnnnnnncnknn
            9-13 n: nnnnnnnnnnnnnndnnn
            6-10 f: fffffbfffhf
            3-5 h: cmhtc
            1-2 p: gzpsj
            4-10 w: wjwhwwwwwvwww
            2-13 g: kwpjkxkjmhgnpsmjsmd
            3-4 c: cctpj
            13-15 k: kvkzkkskqkkkmkdkkkk
            8-9 x: qnxxxfbdx
            10-15 k: rkkbkvckkknxlmb
            7-8 l: llcqslvlljgll
            2-4 b: dtgbb
            9-11 j: sjrkthwqjjq
            1-4 z: bpzxzvjzrwhtpccm
            8-9 n: nnvnnwwnnlnnnznnnn
            5-7 j: sthpjjpwrt
            12-13 s: ssssssssssssn
            3-4 m: mnmgf
            7-13 p: pppppprppppppfppppp
            6-8 h: zhhbwhht
            13-16 t: ttdtttttttttctkt
            8-9 l: lllnhlllzpjlqllzld
            7-15 x: fpkxzbbnxlcxxlxvx
            3-10 b: bbbbbbbbbk
            3-4 z: zzrg
            1-4 w: wxww
            5-6 b: dbbbwbb
            2-3 r: frrhnh
            1-11 d: qqsrfdddxdzdg
            5-7 z: zzzhzzxz
            5-6 b: slsbbb
            1-2 b: jsbbg
            2-10 t: tzttmtpwttttttm
            4-5 n: kngxn
            5-8 d: tpndxhvd
            4-5 z: zgzbzzg
            5-15 s: ssssssssssssssls
            2-10 g: ggjgcglgggt
            15-16 w: wwwwwwwwrwwwwwvzwwg
            1-4 s: mksm
            1-3 q: qqjqq
            4-5 p: kwpkg
            7-19 z: pkqkkzzzqccnlpzgzzz
            4-6 k: kkkfkc
            3-11 h: khshhhnnzphc
            3-9 h: tkhghdhkhbhgx
            4-8 n: kzntlxwn
            1-2 v: xvkmv
            3-5 m: mmmmkm
            2-7 q: qqbwwctqbqs
            2-3 m: mmmm
            1-5 k: kkkkk
            5-10 t: tttttttttbtxttt
            1-4 l: lllblllllllllllll
            11-12 c: cccccccccccwc
            7-12 f: bfvpqzgwjxrnffjzm
            1-13 k: kkkkkrkkkkkkkhk
            1-2 w: pcwwwb
            6-11 j: jjqjjnbznjt
            3-4 d: vzdn
            3-5 f: ffhkc
            6-9 t: fbttjbtttlzdktf
            1-8 k: rrkkkkkb
            4-7 f: kbvdphfjgkdthtvffh
            1-5 c: hgtcjnjqf
            7-11 f: zfffffljfffffffg
            3-6 j: jrjjjsjjj
            7-14 r: rrrzrrrpjxrtrrrrrr
            2-6 d: tdvbjdzqj
            11-12 l: zbfnlfzlllls
            2-5 c: cjccnf
            6-8 v: vvvvfvvvv
            9-10 b: bbbbbbbbbbbbt
            10-12 l: llllllldlllh
            8-13 g: sggzgggjggggjgggqz
            8-12 m: mmsmmrmmgmmgmmmfhmmz
            2-4 m: mqsmhnm
            2-3 j: jjljjj
            6-15 w: wrwwwkwfwzwnjcwwwjhh
            5-6 p: cbppwb
            1-10 h: xhhhhhhhhvhhk
            6-14 c: dccccvfcmlcxgcccc
            2-7 r: cmxrrrcmrr
            13-16 f: ffffffffffffcfft
            4-5 s: rsbzssssp
            8-10 j: jjzjjjjxjpj
            3-12 n: nnnnnnnnnjnnn
            13-14 g: gggggggghggggjg
            10-11 s: tzssqhxrsss
            2-12 l: lllllwdlltvlblxlln
            11-18 n: wwnnnnvnhnvnnnntnpn
            5-6 h: khkhhhhhzfhdxkqmk
            1-4 z: czqrzzzzz
            11-13 f: ffffffffffffcf
            1-3 x: pxxx
            2-5 t: tttttttt
            4-5 d: ddddld
            1-3 c: chcsck
            8-11 d: dddddddkddzd
            9-14 n: nnnwwnnnnnnnntn
            1-2 t: tftqt
            6-7 d: hdtncds
            3-9 r: lbrrkmrmrw
            9-10 w: wgwwwwwwww
            2-3 j: jjgcqjjj
            7-8 q: cqqqqqqq
            4-12 x: xsvxsxsvlxxrqxx
            7-14 l: sldglzflqgddxwlvlc
            6-8 l: lllggcqlllll
            3-8 b: bfbqdlgbwjldng
            1-4 g: kgggggg
            3-8 n: lpnxplmnz
            11-17 g: ggggggggggpgggggmgg
            18-19 t: ttttgtttttttttttwrtt
            8-10 x: fxjxxwdsfqxwnpmvxf
            11-12 d: ddddddddddvj
            4-7 n: qpnbgnnw
            5-7 x: xfkrxfxk
            6-13 r: rrrstrrgvdvrrrnm
            4-5 m: zfmmr
            5-12 r: rbrrcrrrrrrrrrrrm
            12-13 l: lllllllllxllzl
            6-9 x: xxxxxrxxsx
            5-6 v: vxtdvvgvwlqfwtbsvnvv
            1-2 j: qdtcpqrltjgppjvc
            3-5 v: vvjvcv
            1-5 f: ffffsfff
            2-3 k: xkkgmnnpkq
            12-19 m: gmmcwcmmnrfqmpmbmmr
            4-11 z: knzzmztfnnzzjszzjfz
            7-8 k: xkczkkkckk
            15-17 m: mmmmmvmmgmmmmmrmm
            5-7 s: xssssss
            12-16 n: nnnnnnnnnnnnnnnvn
            4-16 b: vbjbmgbplwltlcbw
            8-11 b: bgbbbbbdbbrb
            3-10 d: ddddddddddd
            8-14 k: kxpkkkkvvkkkzk
            3-6 l: llzllll
            16-17 d: tnjdmnddkddbdvvddddm
            5-9 h: bbchxhnhqk
            3-6 d: wpqdfl
            8-13 z: zzzqfkzhzzcmz
            3-13 q: qkrwstgphfrtq
            9-10 b: bbqtrtsbbb
            19-20 q: bbmkgtnsgzmqzqsrwcqd
            3-11 q: dtvgqqnwmgzs
            12-16 x: xxxxnxxxxxxqxxxxxxx
            10-16 p: vpmpppprxppmgppppqcq
            3-6 l: mxxlbllpwblzlllnl
            12-13 v: hvfvnjvgvvpvvjkvvj
            2-12 v: scqjdrlkfzrl
            5-6 l: lllllp
            4-5 g: pgsgg
            5-6 k: nkktsjgknkbz
            4-8 v: vfvvvvvvvvv
            6-11 k: ddcqknhhkck
            6-10 w: gwqpwwwwtfwv
            2-9 q: qlkqkkqqqlchq
            8-15 n: ghsnnndhlxpjwnqsnnp
            6-7 l: lllllllll
            2-5 x: xxtcx
            6-10 x: lwtcqxjxvxxhxpxxxsx
            2-4 t: lvglqt
            2-3 d: tfsq
            7-17 m: dxnmnwggnmdmrmhjh
            6-7 g: tgsvggdkmlpstg
            1-8 n: nbnzflml
            6-8 c: clccpclsp
            6-8 r: rrrrckrdkrrwzrr
            3-12 p: pplpppfppppppp
            2-4 c: fccc
            10-16 r: rgrrrrrrrdrrrrrrrqr
            2-6 x: xwxqxqx
            7-11 h: hwhhvhvrghrhnh
            7-11 z: mjjxrfhftbbbklzkv
            4-5 c: ccpcc
            9-17 z: qznzzcvzzjczzzjzzz
            18-19 z: zzzzzzzzzzzzzzzzzrz
            2-3 r: bdvzlrkjhjvqp
            16-19 d: dddddfdddqdddddddddq
            14-18 b: bbmbbbjbpbqtbdwbbb
            8-9 f: mfddqvlff
            7-10 x: xxxxtxkxxb
            4-5 r: hbvxthrwllx
            3-4 t: tltstng
            2-4 f: tfnrcgqf
            1-6 g: fgvbwg
            7-10 z: vzznzzbzzklzzzlzz
            10-13 j: jrwjqgjjzjmbklqxwjn
            1-5 s: sssssss
            8-11 v: xfpwhwvntgvht
            8-9 l: lllvsglzltllwhl
            7-20 n: jnnsnnknnncknnnrnjnn
            7-11 c: cvblgfxdzcccxjdclt
            8-12 t: tthstttktfttzmdtpk
            9-12 g: rggvkgnggggm
            5-8 f: jrfppdsnpjkwjrdhddf
            5-6 n: nnnnnwnn
            7-12 j: jjjjjjjjjcmkjj
            2-5 g: gbggkg
            5-16 p: ppgpnpppppppppprpp
            1-6 d: ddgddvdd
            3-11 s: sscsksssssldssss
            5-13 j: jjjjjjcjjjjkjjjjj
            9-13 m: mfmmmtvdcnwmmmmm
            2-3 f: fffrjn
            7-9 z: zzzzzzzzfzzqnzzz
            3-6 b: bbbbbbb
            6-8 v: dvxvqzvv
            4-5 h: hhhwhh
            1-2 w: wwwwwwwwwww
            6-11 h: shqlvhbqhbh
            6-7 d: dddrddtdd
            11-17 z: zzzzzzzzzzzzzzzzl
            6-7 t: ttttttttt
            2-3 j: zjstccxb
            11-13 q: qqqqfqqqqqqqsqp
            2-7 p: sppznwpjptppdppp
            3-4 m: mmml
            3-12 g: phkfggggkzgxbsxr
            1-2 c: ppcbvncvck
            12-18 h: kjmmtxkrjthtsphgsb
            13-16 n: nnnnnnnnnnnnwnnn
            11-16 s: xstpxfxtkgscbgws
            14-15 h: hkktqhhszldhhkh
            8-12 j: jjjjjjjjjjjdjjj
            13-14 k: phkkkmkkkkqkkrkkk
            4-5 h: hhhqqhhhn
            4-12 k: kkkkkkkkkrkkkk
            7-10 q: qqqqqqqqqbq
            5-7 s: szssqsgs
            8-11 l: lllllllllll
            10-11 w: tfbwwxwwmkp
            10-11 s: blkkznbrtss
            2-4 t: dtxt
            12-13 x: xxxxxlxtxxxfxxn
            9-15 v: mvvhvwnvgvvvvzc
            6-17 g: gbggfxvmlfjmgdmshfzq
            9-12 n: lqmsxjnnnwrqphn
            6-17 b: bbpljfjbsbgfzxgsn
            13-15 f: fjgfdsffphbcsltw
            3-8 g: kxjlsggg
            2-10 n: nfnhnnnnnknn
            2-6 x: xzxxxpx
            4-5 f: zddjhfknqffsbbf
            3-5 r: skxgqcrrrx
            1-2 x: rxcddx
            8-12 g: gggggggggggmgg
            1-6 j: jjjjddjj
            8-11 z: zzszznzfzzz
            3-14 s: hwjszphhcwjmhsssc
            5-7 m: lpcnpsr
            5-6 f: frffplfffff
            4-7 m: msmkrmw
            4-10 s: vhlztshrspskv
            13-14 q: mqqgqmcpqpdrqn
            5-9 h: hhhmrhhhh
            4-6 r: lbqhmw
            5-6 b: mbzhbsbbhthll
            13-16 v: vvvvvvvvvvvvhvvdvvvf
            10-12 w: wwmwgwwzwpwv
            2-12 b: kpxbpfbfbcjfbkcfxmbb
            14-17 n: nngnnnnfnqnnnnnnrn
            6-10 h: hchhhhqhhxhhzj
            5-6 h: hzvnwb
            7-8 p: pnhxqpls
            4-5 z: zzztzz
            11-12 c: fclcctjcfdqrcps
            6-15 v: jgclvvsqkqgjkvvcl
            1-13 j: wjjjjjjjjjjjgj
            6-7 f: fffffmfzpf
            6-12 p: kppppgppzpptphxp
            13-14 b: bbbbbbbbbbbbbbbb
            18-20 f: ffffffffffffffmxftfv
            6-11 k: gfkkkctxmkrkp
            1-9 r: rrwvbwdtr
            8-18 b: bbbbbbbtbbbbbbbbbbb
            3-10 t: ftqgcktpthttztm
            5-8 j: jjzjjjtjlbhj
            2-6 w: hwkljw
            10-14 g: kggggggfrrgggxgg
            7-13 z: zjszqzxzdzzzkjzf
            1-6 p: ppppppppp
            8-9 p: pppppdpgqpppp
            13-15 g: gggggpsggggtggbg
            4-5 g: gpmsg
            2-5 z: vzfhzzhphh
            2-4 g: jgzq
            8-9 g: pgjggbbgf
            3-4 r: ljsnp
            7-13 x: xxxxxgxxxkxxxxvxkkxm
            2-6 g: nggfgw
            9-10 m: mmmmmmmmldm
            15-16 w: wwwwhwkwjnwwwwdn
            10-18 r: rrrrrrrrrrrrrrrrrkr
            2-3 q: qplq
            1-7 m: tmmmmsq
            2-5 w: swwmwk
            2-3 l: slgkdtjznfxdml
            10-12 q: qxmmqjqqqqqw
            12-14 c: bhlhjcwkcndchwc
            10-11 d: dddddsddddl
            13-14 g: mxdxkmvcgrsqgn
            3-4 t: qtttpmt
            14-16 b: bbbbbbbbbbbbbbbqbbb
            2-11 w: zdggnxfnzpwnf
            6-7 r: rfrcrrf
            9-10 h: hhhhhhhhfg
            7-8 r: rrrrrrvl
            8-9 n: rnsnvlrqdq
            4-7 f: ffwnzdf
            15-18 x: ngxxvqwxzlhxwpxxxz
            13-15 w: nwwwwwqwwwwwtww
        """.trimIndent()
    }
}

/**
 * DAY 2 PROBLEM 2
 */
object InputDay2Problem2 : Inputs() {
    override fun getInput(): String {
        return """
            3-4 j: tjjj
            7-10 h: nhhhhhgghphhh
            7-13 j: tpscbbstbdjsjbtcpj
            4-13 l: ckllmqzlvcsxpplqg
            3-11 n: nnrhnnnnnnnwsdnnnm
            5-6 d: ddddddb
            7-10 z: szfwzrbzzz
            1-10 w: wwwwwcwwwrpnwzwxww
            5-6 w: cgwppfwlwrwtnw
            12-13 m: bmmthmmhmmmbmmmmm
            1-4 b: gbbj
            10-14 k: kkkkkkkkkfkkkzk
            1-3 n: nndn
            3-4 w: wwpf
            15-16 q: qqqqqqqqqqqqrqqqq
            3-4 w: wwcg
            10-12 r: rrrrrrrrrcrrrr
            10-11 v: fvlvrvcxvvp
            4-11 l: qdklwltggdcqn
            2-4 p: ppskptpp
            3-8 r: rjrrgrrk
            5-9 g: mgglggggrggggggxkggw
            9-16 n: njnnnnsnrnnnnnnhnnnn
            4-5 v: fgjvvxtqdmtqhnd
            2-11 r: rrfbltcxmqm
            4-7 q: hdkqfsq
            2-4 s: smshsswsztsmgssssss
            8-9 m: mmmmmmmlwm
            2-9 x: xxxxxxxxpxxxxxx
            3-4 d: zdgddd
            16-18 q: qqqqqqqqqqqqqqqbqj
            2-12 s: ssssmssssssssss
            8-9 q: dnztqqjqq
            1-3 d: ddddddddd
            2-10 h: hhhhhnhhvhhbhhhhhh
            8-11 l: wpjmvxqlmqllprw
            3-14 w: wwwwwwhwwwwwwpwwwwwf
            2-3 m: dlggmnlr
            1-6 b: bbbbblbbbbb
            1-10 c: ccbhdccdhltc
            2-11 g: cgrggfsgggggj
            10-15 t: ksnnwcqxcpzsvtcvtwm
            6-7 s: ssssssps
            17-18 j: wpjjjjjjjmjjjjcjjj
            7-8 m: cmqmmmlz
            3-4 m: mqmm
            3-10 h: dfhkkztbmhvcjvh
            7-16 x: rqwfvspqcxmpxnwxbd
            2-4 b: wfbbbfnj
            1-3 j: jjjj
            7-8 m: mmmmmmtw
            14-15 p: kpppwppppppppdppqp
            7-19 d: dddqrdkcgxxxdddddrdc
            1-6 l: cnlgtlc
            2-6 f: nfffffvfffqfrf
            11-15 s: sssssswsscsqbjdss
            6-14 s: sssfsssmsssssbsrnsh
            6-7 c: fcnppcc
            4-14 n: rshnnldbsnwvnwnnqnwn
            2-4 c: lcccrghcqwvc
            9-15 b: bgvjbclttvbqprb
            5-10 l: hlllqldgllnpttxqllrl
            8-18 h: hbhjknpnhvhpsbvsrdmh
            5-9 d: dddddddddd
            6-7 x: xxxxxxqd
            6-17 x: xntqxxxxxxxxxnwqnn
            10-19 f: fffjfffzfflhnfrsffq
            5-8 b: bbjfzdbhbb
            2-3 j: jljl
            16-17 s: swvsvsszsshssksssrn
            3-8 t: vtmhjrbx
            7-11 p: kpppppppppppppp
            3-4 j: wjjjk
            9-10 b: lbbpbbbbvb
            4-9 l: jrlbmrthlbjlmpgf
            5-7 g: vggggbwxgslgj
            11-17 f: gfmjfffdzfmvffpqff
            6-11 t: nbbbttmhbtwt
            6-7 p: jpprgnspppf
            6-7 w: wwwwwjwq
            8-11 g: zggggggchglqgggg
            15-16 x: xcxxxxbbxxxxxxxb
            2-16 d: xmnpfhvqnxcqdrgcw
            8-9 d: fdskddfwlddb
            3-9 x: xxxxxxxxs
            2-6 p: pppppbppps
            3-6 t: bjtptj
            18-19 w: qwwwwwwwwwwwwwwwwwww
            6-15 n: nkfndnxwzfjsvhnp
            3-4 v: lnvv
            7-13 v: mvvvvvbbvvvvmvv
            4-6 d: ddddds
            4-8 b: ftpbnfbsblvbvhlhtlb
            3-4 g: fnkf
            1-4 x: xxxw
            1-8 r: rrrbxnsrqrrrrqrr
            13-14 z: zzzzcvzzzzzzzzzz
            4-9 x: zhtvxfbzxdvkn
            1-9 d: zdddddddddd
            10-12 g: lhhddwgnjjwz
            6-12 p: ptpwlppsrzphlppqpd
            11-16 f: pfnxnbsfbsfdbzrx
            11-14 r: mccfwbcpbhrrlnvn
            10-14 w: wnwwwswtwwkwnw
            14-17 k: kkkkkkkkkkkwkwkkk
            7-9 g: kgkjktghg
            1-4 x: mxpxbjxxtvmw
            2-6 z: zzsswzr
            2-8 g: mcktgkkgqmcn
            8-19 n: znjnwhhnnwfdnhncwjdw
            3-4 k: pkgljmkdfhsxhpvwc
            7-13 m: mkpmmmqnmkmjrmcmm
            2-3 w: wvwcwxr
            19-20 q: qqqqqqqqqqqdqqqqqqmq
            5-6 r: rkqcrhs
            4-6 b: bbbbbq
            3-11 d: ddgddddddddd
            15-20 m: mmmmxmmbmrmmmfmmmmmm
            3-4 q: qhwq
            15-16 n: plzwngnnvzcnwknn
            4-11 l: ghlswpdrqvlsfj
            3-13 m: xdmvpmhktsmfm
            4-7 b: bbbbbbbbb
            4-10 w: mwwwgmgtwnwpbnw
            7-9 l: llllllpvlll
            3-11 z: zzdzzzzzzzzz
            3-4 h: hpnkhtz
            18-19 b: bbbbbbbbbbbbbbbbbbdb
            5-11 q: tqqqqbcqqqqdhq
            4-8 g: sgtgglgpgwjjj
            10-12 d: ddddddtkdcdr
            7-8 h: hhmhhhhh
            2-9 h: hrhvhhxhxghghh
            5-6 x: vxxxrh
            3-5 n: cgnfn
            17-18 z: bzzzzxtzcxzjvzzlzbn
            10-13 f: nfxwjfffffpfvffbvff
            1-3 p: pxpppp
            1-3 g: gqgbg
            9-10 v: vhfpwvvbvvfvvv
            3-7 r: rrsjrffrvwrrrr
            3-10 g: qlrrgglblwpjqccmw
            13-14 x: xxxxxxxxxxqxxx
            4-12 h: xrbkrnxjghkp
            13-14 s: xhsssswkssrsls
            6-8 r: rrrpgrrgrzr
            12-15 m: cmmmmmmmmmmmpmx
            2-8 l: wccfwrxl
            1-13 f: ffdfpdffffffffff
            10-12 d: dxdddddddddj
            9-18 b: ltnbbbmrfqbbbfbbgnd
            2-4 k: kbkklk
            7-8 n: nqmdncklnqnftjpvrcj
            6-7 s: ssssszshsss
            5-8 t: tttttsttttt
            11-19 k: hkvrktkkkkthrkvkkkkf
            3-5 x: qrxxbx
            11-12 d: ddddddddddzgd
            7-18 d: ndszddkddsdbdcqdddp
            7-8 t: ttttttttt
            2-4 s: gsksqskhjb
            9-13 d: dlqxsdddjdddg
            2-6 n: fgndtf
            6-11 s: sssssssnbsvss
            4-10 p: kjtpbjwpmb
            12-13 s: wssssssplsstscsszsds
            2-4 h: jthg
            1-2 z: zzzszhzzrvqz
            8-9 j: jjjjbjjncjj
            3-11 q: qvlqqqqqqqfqqqqqqqq
            8-15 w: pfqmwwwwqsccwgllm
            1-4 q: nqqhq
            7-16 k: kkkbktkkkjzhlkkkf
            4-11 s: kzjssthfsbtndfsd
            1-13 g: gbggljgggggggngggk
            1-9 q: qqqxlqvsmqg
            17-18 g: ggggggggggggggggfgg
            6-8 n: nnnnfsnrzksn
            2-4 k: zkhk
            10-12 n: gnfnnkknnnmnp
            1-3 j: jxnxw
            5-6 n: nbnknsjkmnh
            3-4 f: mkhf
            11-14 f: ptnpgkfzgzgxpk
            3-4 g: gwdj
            2-4 h: hhkh
            4-5 b: fvbzqx
            1-4 x: fxxp
            4-13 c: cccckcmtcccdccrcccc
            1-7 r: rrrrrrnrr
            9-12 g: rdhzhbspgxgccmmggg
            4-6 f: smfndrpscf
            2-6 j: jjjjjjj
            4-5 d: dddnzdd
            2-5 b: rbwgd
            4-6 s: sssssss
            3-6 d: dvnmjd
            10-14 x: xxxxxxxxxsxxxxx
            3-5 t: swttxctxf
            3-20 m: pxmlmzwzmjmnmnmcmmmr
            3-4 l: gdll
            9-13 h: kmhhhnznshhhhhsmhfx
            6-9 d: ghdlqfdmthdsjdcjht
            9-10 j: jdbqjjjjjjdjj
            4-7 q: qqvhbnqzxt
            5-18 b: mblpnblwlxjbxhqcmbl
            6-9 j: hjcwsvdgq
            9-16 t: kbtdksjcmmqpngdm
            6-9 z: zzzzzzzzzgzzzkzz
            18-19 x: xxfrxrgbbxpxxxxxxxqx
            4-5 b: nhbbz
            9-11 w: whwwwwhwwhwwww
            2-3 w: whww
            3-4 s: bsfsdgs
            5-7 k: kkkkhkwk
            5-9 f: ffxfffffqf
            4-5 z: bzzzggzjr
            14-17 n: nhjnxnnwxwvxnnlnv
            6-7 p: xpsklmg
            1-6 b: rbvblrkcblbbbb
            3-10 k: kkxkkkkkkck
            2-7 x: wxxdxgxtxqxxqxxxxx
            3-6 k: kwkfkznkkkq
            10-14 k: klqkksvskjkzmkkk
            2-6 p: wprgppgppszh
            4-5 b: bbbgbk
            8-16 b: kblbbbpvmjpbbfhhgbb
            6-7 g: hgdglzg
            3-7 g: lcgtgvl
            1-4 s: cssxs
            11-14 m: mhdpbnxqtpvfck
            11-20 b: bbbbbbbbkbnbbbwrbbbb
            1-3 l: lpcthzrgmmplrlxnbnw
            2-4 l: lbls
            11-12 h: thhhwhhhhhbf
            1-8 h: hhnlnhrc
            2-3 r: frpl
            8-12 p: ppppppkppnfpnspp
            6-14 f: fffffffcgrffffffk
            11-13 n: knnkrnkhvnvhsnhjmfb
            1-3 m: jmhjkk
            3-10 g: ggggggggggggggggggg
            6-8 m: mmhmmrtzrbgs
            14-15 c: nnvzfcvcrqcxbcw
            1-5 j: jjjjz
            1-15 r: rzjdmjjlfrbrmrrwlrr
            4-11 j: jjzfjjljnjjjjpj
            2-3 h: hhdh
            4-10 p: rppwqpppppp
            2-6 q: qqmwmqq
            10-19 t: dhjttjkspttxzbtxjmx
            10-11 r: rrhtjkdrrjl
            3-4 w: wwxwf
            4-17 n: ncsnlnnnnqnnnjnnqbc
            3-10 b: bnknbwbbbbb
            10-13 v: vvsfvjltvbwvvvnzv
            12-18 w: wwwwwwwnwwwfwwwwwww
            2-14 w: dwbmkgmqbqlcpwv
            1-9 r: rrrrrrrrkr
            1-5 f: ffflffffffff
            11-13 f: ftffffffffffgfff
            1-7 r: rwrrrrrrrr
            7-13 x: jthgxdmdxrbmvf
            5-6 r: wqdtqzrt
            4-13 d: kccfgmvknwbddrxmx
            9-18 x: xxxxxxxxcxxxxxxxxxx
            9-10 h: hhhhhhhvhhh
            8-16 v: gpblbxmvzhdrnjbrv
            6-10 t: ttttttttttttttttt
            5-9 k: slkkdtvhk
            4-5 f: ffpjq
            7-16 t: tktttttttttgtttttt
            4-7 k: kkkjkkdb
            3-4 q: qmvq
            2-7 b: whmfplbb
            16-17 p: pppppppppppppppppp
            5-7 h: hwphhngh
            4-5 w: kfjwlwcbhgz
            5-6 p: pxhppps
            17-18 k: pkmgdkdkckkvlrtnzj
            12-14 z: dkzzzzzztkmjzh
            6-9 d: ddddddddddjddddd
            1-6 v: vvvmvznvvbv
            1-8 b: bltbdzjb
            8-9 v: vvxvhvbvl
            8-15 m: mmmmmmmmmmmmmmvmm
            12-14 k: kkkkzkkkkkkkkk
            13-15 j: jjjjjjjjjjjjjsnj
            3-6 r: rrmrrrrr
            4-13 q: pqdrqqqqfhcqq
            2-7 b: lbzbkpbgvb
            5-9 h: hhmhrhhhhhhh
            4-5 h: hhfhb
            1-2 f: rfcjf
            4-12 f: gcffrbpvcnhvcrrj
            5-6 q: qcqrgs
            10-14 l: xcflwdwgbrqjwl
            13-16 v: qkvxzcltfsvmzgxqvt
            7-9 g: gggggggggg
            17-18 c: ccbqmccwcccfccgccc
            2-6 k: lkkkkwkk
            3-12 v: rqvqkhwxsrvv
            9-10 s: ssssqsksssss
            5-6 j: jjjjzj
            6-7 m: jnvpssgqtczz
            2-15 d: hdjhrksnlsbxdjdwvf
            11-18 m: mmmmmmmmmmzmmmmmmmmm
            5-6 m: mrdjgl
            3-10 h: xthspkwhjhltlcrds
            2-15 p: pbpppppdpppppppppkpp
            1-5 n: nznwn
            8-14 h: zghhhhghkzhllj
            15-19 v: vvvvvvvvhvvvxvvvvvg
            3-5 p: ppzpsbpp
            2-5 b: bwkdrdpkrtjdv
            8-12 x: qlxxxxvxxxsxgx
            2-10 z: zzzzzzzzzz
            2-13 w: bfvwhwwwpwbwwm
            8-10 p: pppppxpppc
            13-14 h: hthhhhhhthhhhzh
            5-7 l: llllccw
            3-4 w: wwww
            2-14 m: mnmmmmmmmmmmmgm
            2-5 j: jjjzbjj
            1-4 r: xrrwr
            6-12 f: fphbffwmffnzf
            1-5 z: pzkszsjzkdqxgzknrd
            5-10 b: bbbbbkbbkb
            9-11 d: dxrpkjhrddl
            5-11 n: bnlnnhqjbbn
            10-15 g: gggggggggwggggbggg
            4-9 q: jqqmqdqxfq
            6-9 q: lfcbxpqgqc
            7-13 j: jdcjjmjwfrjnnr
            1-13 g: xgggggggggggcggg
            10-11 d: ddvdxdmdddk
            4-6 n: nnnxnt
            5-7 n: hnjnnfnfpnrdntrh
            3-8 b: bgbrffxlbrbbb
            9-13 z: fdhdzzznzxzgj
            2-7 r: rqrgblk
            10-14 j: jxkjpjbjjjjjjsggjpp
            3-4 m: mmmm
            5-6 m: mmmmmmmm
            3-8 k: lvkvqcgkzkdcptc
            7-13 g: glbnggkbzkghgmg
            5-8 d: dddddddcd
            4-5 l: llllh
            5-15 w: wrwwwwwwwwwwwwwwqwww
            14-16 p: ppzppppptdpppsppppp
            8-12 p: ppxpppvppppkk
            15-17 x: xxkxxrkxxxxfpxxxx
            12-15 s: ssssscsssvssssgcs
            4-6 p: pppppp
            3-4 j: gjjjjwwj
            3-5 f: mfwhfpk
            16-18 p: pppppppppppppppxpmp
            1-2 m: mnmcrmq
            10-19 t: bttttttbtttttttttttt
            1-13 z: qzzzzzzzzzzzzz
            11-17 w: zpdsdfmhgmvcvzkdwpw
            5-7 z: zzzlfzgzz
            8-15 d: dddddddpddrdqgt
            2-3 k: nkjkk
            11-12 q: qmqqqqqqqgnnfqkqc
            1-2 p: pgpp
            5-6 b: fnbzbb
            11-12 z: zpzzczkzzrpszzzzt
            13-14 t: ttttttttttwttqtt
            4-6 p: phpfpp
            2-3 f: fvfws
            6-7 f: fffflfdff
            8-9 q: cwpqcqzqpf
            5-7 p: spppjpkpc
            4-11 s: sgsssdbbhpkssd
            1-6 s: wsssspsfsss
            1-3 m: mdmmmmmm
            4-6 d: dtdtmdg
            1-3 w: wwzwpww
            10-11 l: tlmhlllnqllb
            12-17 m: mmmmmmmmzmmtwmmmg
            3-4 c: cctkcc
            13-14 b: bsbbbbbbbbbbglb
            6-7 w: wwwwwxd
            1-11 j: kjjjxkjjrqj
            5-8 z: zbvjzzzz
            1-5 k: gkbktk
            11-13 k: kkkkkzpmkkkkm
            10-11 z: wtpfvmmpqhg
            2-3 s: bssc
            8-17 h: hhhhhhhxhhhhhhhjhh
            6-9 l: lllllmllll
            5-9 l: llllllglll
            2-7 q: qkqdsqm
            6-8 s: ssssssjtds
            7-8 c: ctfdfmccjhvrc
            4-5 w: gqcdwcwktmm
            4-13 b: wwjbnmghbjkwzbbj
            1-9 r: qbprwrrmsrr
            3-4 c: kcscl
            3-4 d: jdqd
            2-7 p: xpzmbfpvpjg
            2-4 f: fnfq
            7-8 b: wjdqkbbb
            13-15 m: mmmmmmpmmfmmgmxmmmm
            4-5 c: mpclj
            9-10 x: txxxxdpxql
            1-5 c: gccjcc
            2-8 k: xzkqkhvk
            9-11 k: kkkkckkkgkkpkvk
            10-14 x: mxzxrkdxgpxcxhxl
            5-6 z: hzzztz
            10-13 g: wzgggggvgggkl
            2-5 p: mmpvk
            2-4 b: stbsbbbbbb
            9-10 r: rrrgrrrrwqr
            1-6 z: xzzfzzv
            3-5 l: ljvlw
            2-8 f: lfqvjghd
            4-5 n: nnznn
            5-16 r: csmxrkrqnwnzzpprvr
            2-15 h: qhtmxhbgzzsbnjwwsqfl
            4-5 s: sfqps
            4-5 c: cqcgc
            12-13 d: dmcddddddddcdd
            3-4 s: xsqs
            14-15 j: jjjjjjjhjjjjjjj
            12-13 r: rcrsrrrrrrrrrrrr
            9-10 h: hhhfxjzvhxhbf
            3-5 w: qwvww
            4-9 b: bbbfbbbblbb
            15-17 b: kdlqpsrbrbbmbbbzbtz
            9-10 p: ppqppjppwjpp
            11-14 x: mbchwxxxxxxxxf
            2-3 t: stdnsv
            2-4 s: sbss
            7-9 k: kvkfkkqjk
            5-6 d: ddddldd
            1-12 g: cggggggggggqgggg
            8-10 b: bcvxgdzbbbbclbddmcpq
            1-3 p: qpppp
            3-10 g: mbggbzlwjgrqncddkbjz
            3-6 n: nnnnnnnnnnnn
            5-14 t: fdtqxdpztgrtzl
            7-9 p: ndppppzpppnb
            6-9 l: llxlmlldltllll
            2-8 p: pwvmbccpvhbqg
            2-5 q: bqccqlpj
            1-12 j: jjpddhjrjkjb
            2-16 j: hnmrxjcspnnrqhcj
            2-4 s: scrb
            3-11 j: jjjjjjjwjjc
            6-9 h: bhlsnhkfhnqhprpdm
            2-4 k: skcn
            10-15 r: prrbrrnrrrrrrvlrhr
            1-2 p: pppp
            3-5 t: ttqtttc
            1-2 k: kwkp
            6-7 g: gggggggfxgmgggggwg
            6-17 g: lvgggggnrwqnsggrgg
            2-8 v: qvmnvvvzn
            5-6 r: rrcmgrvrhrf
            6-7 w: cwwhwwq
            1-16 l: rllllllllllllllll
            14-16 v: vvvvvvvmvvvvvqvvvhv
            13-16 m: qmmmmmmmmmdmmmghmmmm
            10-13 x: xgxxbtbxgxxxdx
            6-7 k: kkvkqkwkkkkvkkkh
            16-18 g: ggggggggggggggggggg
            1-12 f: ffffffffffsmffn
            11-14 c: kmltgplwdccvzchtfs
            1-2 l: whll
            3-10 r: tchrjqrwnrnhlrzssdr
            1-4 b: jbxbrb
            9-10 d: dddddddddldd
            4-6 r: rwrrrrrlrchnqxv
            1-5 z: sjznb
            3-4 p: wqtp
            3-13 n: zncsfbdxpnpzn
            6-8 b: ppbzbvjhmfnq
            2-4 h: hhhr
            5-6 w: lwrgll
            10-15 l: lllllllllllllllll
            5-6 l: hltlllbwlr
            8-9 q: tpzqmqqssqqqqq
            12-17 v: bmxhqtvmrgvvgqzvp
            7-8 t: ttttttvtt
            11-12 r: rrbrrvrrnsrr
            2-5 f: wzrnlcxfhnchsrzjxl
            12-17 l: lllllllllrllllldl
            9-10 h: phhhhhhhrzhq
            5-17 q: chqkqpjqnqjlcvbxlqkq
            1-2 m: hbmm
            4-10 f: vtfffsbvsff
            5-10 h: hhhhhhhphnhhh
            2-3 x: xlxxxnxltdxbxdbxpg
            4-12 x: nlxxtcbbbknh
            2-3 l: llfll
            6-9 p: ppppppppp
            2-4 v: grwdv
            5-8 c: fkpkccdcvdvck
            2-8 l: khzlpwdcddk
            2-7 v: vlbvvbl
            7-8 h: zhhhhhnh
            12-14 p: phpxppkprhbpvpp
            5-6 j: jjjjcsj
            5-12 m: srctztgnwtrmmmwkjk
            5-6 s: ssslss
            2-3 m: mxmm
            10-13 c: ccccdcdcccchzlcw
            11-12 k: kkkwkkkkkkkkkk
            9-11 g: rfggsgphdhg
            8-13 w: wwxwwwzwfwwwtlww
            5-6 f: qvpfmt
            12-13 n: mlnntnnzblnnvnd
            7-8 q: qqqqqqbqqq
            4-7 p: hpnvfpmpgqp
            14-16 b: bbbxbbbbbbbbbtbdbvb
            16-19 g: gwgggcsgggpggjgjggj
            3-6 k: kkkptkkdrk
            1-7 l: slsrxllllw
            3-12 d: dddddddddddqdd
            5-6 m: vcwtmdmmmmxzm
            4-6 r: rtcfcz
            7-12 x: xxswxxhjxnxxxx
            6-7 t: ttswtkztt
            15-18 g: nggckgdmsvdrqlgcqz
            6-9 t: tttttstttlt
            16-20 f: fffffffffffffffffffl
            7-10 l: bcbdhwlslwlqx
            8-11 k: kkkmkkvksmktkskkxkmk
            9-15 h: rptgwtvxjgzqjrtqqc
            4-6 j: jjjjjjjjjj
            12-15 w: wwwwwwxwwwfwwxrw
            13-15 d: ddddddddmdcdcddddd
            13-14 v: vvvvvvvvvvvtxv
            10-12 f: fffffffffffvf
            7-10 j: jjlftzjmjz
            9-10 w: cwwzwwllwfwktqkwxr
            1-8 b: bbbbbbbvb
            11-14 d: dlsmbgcdxhxfnqdhzd
            17-18 k: kkkkkkkkkkkkktkkbq
            7-8 k: kfkpkkkkkk
            4-9 w: zbwwwrckwntbdqfd
            7-8 m: mmmwmmgm
            7-11 v: cvxllpvgdnh
            5-13 c: cmccqccjcccjc
            12-14 m: mmmmmmmmmmmmmvmmmp
            4-11 x: dgvxxptdgkxpxl
            4-5 f: pfclfffk
            7-14 l: lllwlwlqqsnmllllll
            10-11 l: pcqllllvlqlll
            2-5 k: kkbkk
            3-6 d: ddddddd
            8-9 d: dddddddld
            1-11 d: tddddddcddmdddd
            5-8 b: pljtbkwkxb
            11-12 t: tttttttktttgttt
            6-7 q: qtqqqqgq
            7-8 v: vvvbvpxp
            4-13 v: vvvpvrzvvvvvvvvvv
            8-11 r: rrrrrrrnrrr
            14-15 b: bbbbbbbbbbbbbzr
            13-16 p: ppppppppppppfpppp
            7-10 g: gfgqgglggg
            4-7 s: ssdsshc
            8-11 t: zttctgtvttfttcrxd
            11-12 j: jjjjjjjjjqwx
            1-6 w: wwwwwl
            4-7 l: zlbmrll
            2-10 k: kkkkkkkkkm
            8-10 x: xxxxxxxjxfx
            4-13 r: blrrkqjczlbnrfbbkd
            8-10 z: zzzzlzzzhj
            9-11 s: vsmsszsssvsqss
            3-6 m: mvkrmmwpzbtmmm
            1-5 r: smlrbr
            5-6 k: rlkklkkkkh
            2-5 d: dkddddddpd
            13-14 g: ggxtggfvgggdgggggcgg
            7-9 x: xxxxxxbxgxxx
            3-16 x: xxxxxxxxxxxxxxxlxx
            11-15 c: chvcccccccqccdm
            3-4 j: kjjjj
            9-10 d: ddddmddddd
            13-14 q: lqqbrqzbqqpcpt
            2-5 w: xgjsxww
            12-14 w: lwtxgwwzwlwbwwc
            3-4 r: hffl
            11-15 b: bbbbbbbbbbfbbbwb
            3-7 f: lffnkpfm
            6-13 v: vvvvvcvvvvvvvv
            7-11 v: vvvhmvvvjvvvvvvvh
            18-19 z: bzqtbfvfkxgzzxkftzz
            8-14 l: gptlllllllxgll
            7-10 w: dwmwrfwkkghf
            2-4 f: fffshfffff
            1-3 n: rnsfgn
            7-20 w: wwwwwwhwwwwwwwwwwwwg
            11-14 g: ggggggggggwggggkgg
            2-8 x: xtxxlxxmmcxllxtxwxx
            2-8 b: jbfclqjbkszckpkxnbn
            1-3 d: dhdhffmd
            14-19 b: bbbbbbbbbbbbbbbjbbbb
            6-8 d: dtjbzdsddddf
            14-16 n: rfmszmgztspnnncqj
            9-10 v: vvvvrvvvvnv
            5-6 r: rrsrrrrrrr
            6-7 v: vvjvvjrv
            6-8 q: tvqsqqvqqd
            1-3 q: qwtdqbgmmck
            8-15 p: ppppqppzjpppplpppppp
            6-12 m: mwmhmsjxgcmmcrzlmmkc
            2-8 j: sjwjljqjjjcdlmgxkjj
            12-15 j: sjjjjjjqjjjjjjkjjj
            14-15 t: vtttttttttttttt
            17-18 r: rrrrrrrrrrrrrprrhd
            10-15 c: sxspsvqkfvqjjccxbbv
            7-8 g: ggggggxg
            2-12 t: tbtttttttntmttttt
            3-6 m: ztjrds
            2-4 h: gdzk
            4-5 p: rtlkkfwntpxw
            8-14 k: kkkkkckkkkkkkgkkk
            3-8 l: rqltzlflljsqmk
            9-10 s: smssswksjsssss
            12-13 z: zzzzzzzzzzzzr
            12-14 h: zhhhqvhhhhxhhh
            13-14 x: xxxxxxxfsxqqsxxxx
            2-3 k: kffk
            1-5 z: jzzzzzzz
            10-15 n: nngnnhnjnnknndnvtbsd
            12-13 k: dkkkkkkkkkkkn
            6-8 h: qhfnrpfh
            7-11 c: ccccccqccccc
            19-20 m: cjbpwtmdfbllvvdrmmmt
            5-6 l: lmrbhtbl
            3-6 j: hjjkjm
            9-10 j: jjjjjjjjtljxjj
            3-5 t: ttbtcttt
            5-8 r: rrrrrwhfrrf
            3-5 d: dqvknd
            5-7 j: jtjjgjm
            5-7 v: vdjrlwv
            8-9 s: ssssqsssssssxssssss
            12-16 q: qxkjsjlsggcqhplq
            16-17 j: jbftlzjjhjjjjvhjjj
            3-14 v: gppvmdbvfwvgnd
            1-8 b: bbbbbbbdb
            2-6 z: pzwhjdzpxwt
            5-9 v: qvrvmdvhwv
            2-3 b: bbhlpxtbxzx
            4-5 z: zzhpzz
            15-20 f: fgzfnbcgtbnmflffqfrv
            4-5 t: ztxttc
            6-11 p: mjppkpcrdflpwqjrwprp
            4-7 h: khdwwhhrhhnchs
            10-11 b: mprbbblmcbbxqbbbbc
            4-6 c: cccjcccx
            1-4 r: nrrhrrr
            1-2 d: dddlk
            19-20 f: bfffffffffffffffffkb
            4-6 w: wlswkwwrdsjtwbww
            2-3 d: ddld
            9-14 r: rrrrrrrrmrgrrjrrr
            10-11 k: kkqkkkkkkjk
            2-5 k: rkkkkxkkkvsd
            16-17 b: bbbjbbbbbbbblbbbrbb
            6-7 k: kkkkkkk
            7-11 v: lfpjgrrvchvjfdt
            12-13 g: fgxqnkgstgpggvrqdl
            11-13 d: ddmmdtdddddhddd
            6-7 g: mpstgwggbx
            11-14 h: hhhhhhhhhhqhhbh
            18-20 d: dddddmdddddddddddddh
            10-12 m: mmmmqmmmmmrxwmmq
            2-13 d: rxnxstxxrjvbdd
            3-4 z: drzlrz
            5-6 d: qddddb
            3-7 d: ddzjcmvtkfdjplhllfn
            10-15 m: wdxhmwbnmmmtrxpcj
            7-8 b: bbkjbbgnbbswd
            2-3 b: bbbhz
            1-10 p: gpppqpppgppppppp
            10-11 w: zwwfbwdqzww
            10-11 n: nnnnnnncnknn
            9-13 n: nnnnnnnnnnnnnndnnn
            6-10 f: fffffbfffhf
            3-5 h: cmhtc
            1-2 p: gzpsj
            4-10 w: wjwhwwwwwvwww
            2-13 g: kwpjkxkjmhgnpsmjsmd
            3-4 c: cctpj
            13-15 k: kvkzkkskqkkkmkdkkkk
            8-9 x: qnxxxfbdx
            10-15 k: rkkbkvckkknxlmb
            7-8 l: llcqslvlljgll
            2-4 b: dtgbb
            9-11 j: sjrkthwqjjq
            1-4 z: bpzxzvjzrwhtpccm
            8-9 n: nnvnnwwnnlnnnznnnn
            5-7 j: sthpjjpwrt
            12-13 s: ssssssssssssn
            3-4 m: mnmgf
            7-13 p: pppppprppppppfppppp
            6-8 h: zhhbwhht
            13-16 t: ttdtttttttttctkt
            8-9 l: lllnhlllzpjlqllzld
            7-15 x: fpkxzbbnxlcxxlxvx
            3-10 b: bbbbbbbbbk
            3-4 z: zzrg
            1-4 w: wxww
            5-6 b: dbbbwbb
            2-3 r: frrhnh
            1-11 d: qqsrfdddxdzdg
            5-7 z: zzzhzzxz
            5-6 b: slsbbb
            1-2 b: jsbbg
            2-10 t: tzttmtpwttttttm
            4-5 n: kngxn
            5-8 d: tpndxhvd
            4-5 z: zgzbzzg
            5-15 s: ssssssssssssssls
            2-10 g: ggjgcglgggt
            15-16 w: wwwwwwwwrwwwwwvzwwg
            1-4 s: mksm
            1-3 q: qqjqq
            4-5 p: kwpkg
            7-19 z: pkqkkzzzqccnlpzgzzz
            4-6 k: kkkfkc
            3-11 h: khshhhnnzphc
            3-9 h: tkhghdhkhbhgx
            4-8 n: kzntlxwn
            1-2 v: xvkmv
            3-5 m: mmmmkm
            2-7 q: qqbwwctqbqs
            2-3 m: mmmm
            1-5 k: kkkkk
            5-10 t: tttttttttbtxttt
            1-4 l: lllblllllllllllll
            11-12 c: cccccccccccwc
            7-12 f: bfvpqzgwjxrnffjzm
            1-13 k: kkkkkrkkkkkkkhk
            1-2 w: pcwwwb
            6-11 j: jjqjjnbznjt
            3-4 d: vzdn
            3-5 f: ffhkc
            6-9 t: fbttjbtttlzdktf
            1-8 k: rrkkkkkb
            4-7 f: kbvdphfjgkdthtvffh
            1-5 c: hgtcjnjqf
            7-11 f: zfffffljfffffffg
            3-6 j: jrjjjsjjj
            7-14 r: rrrzrrrpjxrtrrrrrr
            2-6 d: tdvbjdzqj
            11-12 l: zbfnlfzlllls
            2-5 c: cjccnf
            6-8 v: vvvvfvvvv
            9-10 b: bbbbbbbbbbbbt
            10-12 l: llllllldlllh
            8-13 g: sggzgggjggggjgggqz
            8-12 m: mmsmmrmmgmmgmmmfhmmz
            2-4 m: mqsmhnm
            2-3 j: jjljjj
            6-15 w: wrwwwkwfwzwnjcwwwjhh
            5-6 p: cbppwb
            1-10 h: xhhhhhhhhvhhk
            6-14 c: dccccvfcmlcxgcccc
            2-7 r: cmxrrrcmrr
            13-16 f: ffffffffffffcfft
            4-5 s: rsbzssssp
            8-10 j: jjzjjjjxjpj
            3-12 n: nnnnnnnnnjnnn
            13-14 g: gggggggghggggjg
            10-11 s: tzssqhxrsss
            2-12 l: lllllwdlltvlblxlln
            11-18 n: wwnnnnvnhnvnnnntnpn
            5-6 h: khkhhhhhzfhdxkqmk
            1-4 z: czqrzzzzz
            11-13 f: ffffffffffffcf
            1-3 x: pxxx
            2-5 t: tttttttt
            4-5 d: ddddld
            1-3 c: chcsck
            8-11 d: dddddddkddzd
            9-14 n: nnnwwnnnnnnnntn
            1-2 t: tftqt
            6-7 d: hdtncds
            3-9 r: lbrrkmrmrw
            9-10 w: wgwwwwwwww
            2-3 j: jjgcqjjj
            7-8 q: cqqqqqqq
            4-12 x: xsvxsxsvlxxrqxx
            7-14 l: sldglzflqgddxwlvlc
            6-8 l: lllggcqlllll
            3-8 b: bfbqdlgbwjldng
            1-4 g: kgggggg
            3-8 n: lpnxplmnz
            11-17 g: ggggggggggpgggggmgg
            18-19 t: ttttgtttttttttttwrtt
            8-10 x: fxjxxwdsfqxwnpmvxf
            11-12 d: ddddddddddvj
            4-7 n: qpnbgnnw
            5-7 x: xfkrxfxk
            6-13 r: rrrstrrgvdvrrrnm
            4-5 m: zfmmr
            5-12 r: rbrrcrrrrrrrrrrrm
            12-13 l: lllllllllxllzl
            6-9 x: xxxxxrxxsx
            5-6 v: vxtdvvgvwlqfwtbsvnvv
            1-2 j: qdtcpqrltjgppjvc
            3-5 v: vvjvcv
            1-5 f: ffffsfff
            2-3 k: xkkgmnnpkq
            12-19 m: gmmcwcmmnrfqmpmbmmr
            4-11 z: knzzmztfnnzzjszzjfz
            7-8 k: xkczkkkckk
            15-17 m: mmmmmvmmgmmmmmrmm
            5-7 s: xssssss
            12-16 n: nnnnnnnnnnnnnnnvn
            4-16 b: vbjbmgbplwltlcbw
            8-11 b: bgbbbbbdbbrb
            3-10 d: ddddddddddd
            8-14 k: kxpkkkkvvkkkzk
            3-6 l: llzllll
            16-17 d: tnjdmnddkddbdvvddddm
            5-9 h: bbchxhnhqk
            3-6 d: wpqdfl
            8-13 z: zzzqfkzhzzcmz
            3-13 q: qkrwstgphfrtq
            9-10 b: bbqtrtsbbb
            19-20 q: bbmkgtnsgzmqzqsrwcqd
            3-11 q: dtvgqqnwmgzs
            12-16 x: xxxxnxxxxxxqxxxxxxx
            10-16 p: vpmpppprxppmgppppqcq
            3-6 l: mxxlbllpwblzlllnl
            12-13 v: hvfvnjvgvvpvvjkvvj
            2-12 v: scqjdrlkfzrl
            5-6 l: lllllp
            4-5 g: pgsgg
            5-6 k: nkktsjgknkbz
            4-8 v: vfvvvvvvvvv
            6-11 k: ddcqknhhkck
            6-10 w: gwqpwwwwtfwv
            2-9 q: qlkqkkqqqlchq
            8-15 n: ghsnnndhlxpjwnqsnnp
            6-7 l: lllllllll
            2-5 x: xxtcx
            6-10 x: lwtcqxjxvxxhxpxxxsx
            2-4 t: lvglqt
            2-3 d: tfsq
            7-17 m: dxnmnwggnmdmrmhjh
            6-7 g: tgsvggdkmlpstg
            1-8 n: nbnzflml
            6-8 c: clccpclsp
            6-8 r: rrrrckrdkrrwzrr
            3-12 p: pplpppfppppppp
            2-4 c: fccc
            10-16 r: rgrrrrrrrdrrrrrrrqr
            2-6 x: xwxqxqx
            7-11 h: hwhhvhvrghrhnh
            7-11 z: mjjxrfhftbbbklzkv
            4-5 c: ccpcc
            9-17 z: qznzzcvzzjczzzjzzz
            18-19 z: zzzzzzzzzzzzzzzzzrz
            2-3 r: bdvzlrkjhjvqp
            16-19 d: dddddfdddqdddddddddq
            14-18 b: bbmbbbjbpbqtbdwbbb
            8-9 f: mfddqvlff
            7-10 x: xxxxtxkxxb
            4-5 r: hbvxthrwllx
            3-4 t: tltstng
            2-4 f: tfnrcgqf
            1-6 g: fgvbwg
            7-10 z: vzznzzbzzklzzzlzz
            10-13 j: jrwjqgjjzjmbklqxwjn
            1-5 s: sssssss
            8-11 v: xfpwhwvntgvht
            8-9 l: lllvsglzltllwhl
            7-20 n: jnnsnnknnncknnnrnjnn
            7-11 c: cvblgfxdzcccxjdclt
            8-12 t: tthstttktfttzmdtpk
            9-12 g: rggvkgnggggm
            5-8 f: jrfppdsnpjkwjrdhddf
            5-6 n: nnnnnwnn
            7-12 j: jjjjjjjjjcmkjj
            2-5 g: gbggkg
            5-16 p: ppgpnpppppppppprpp
            1-6 d: ddgddvdd
            3-11 s: sscsksssssldssss
            5-13 j: jjjjjjcjjjjkjjjjj
            9-13 m: mfmmmtvdcnwmmmmm
            2-3 f: fffrjn
            7-9 z: zzzzzzzzfzzqnzzz
            3-6 b: bbbbbbb
            6-8 v: dvxvqzvv
            4-5 h: hhhwhh
            1-2 w: wwwwwwwwwww
            6-11 h: shqlvhbqhbh
            6-7 d: dddrddtdd
            11-17 z: zzzzzzzzzzzzzzzzl
            6-7 t: ttttttttt
            2-3 j: zjstccxb
            11-13 q: qqqqfqqqqqqqsqp
            2-7 p: sppznwpjptppdppp
            3-4 m: mmml
            3-12 g: phkfggggkzgxbsxr
            1-2 c: ppcbvncvck
            12-18 h: kjmmtxkrjthtsphgsb
            13-16 n: nnnnnnnnnnnnwnnn
            11-16 s: xstpxfxtkgscbgws
            14-15 h: hkktqhhszldhhkh
            8-12 j: jjjjjjjjjjjdjjj
            13-14 k: phkkkmkkkkqkkrkkk
            4-5 h: hhhqqhhhn
            4-12 k: kkkkkkkkkrkkkk
            7-10 q: qqqqqqqqqbq
            5-7 s: szssqsgs
            8-11 l: lllllllllll
            10-11 w: tfbwwxwwmkp
            10-11 s: blkkznbrtss
            2-4 t: dtxt
            12-13 x: xxxxxlxtxxxfxxn
            9-15 v: mvvhvwnvgvvvvzc
            6-17 g: gbggfxvmlfjmgdmshfzq
            9-12 n: lqmsxjnnnwrqphn
            6-17 b: bbpljfjbsbgfzxgsn
            13-15 f: fjgfdsffphbcsltw
            3-8 g: kxjlsggg
            2-10 n: nfnhnnnnnknn
            2-6 x: xzxxxpx
            4-5 f: zddjhfknqffsbbf
            3-5 r: skxgqcrrrx
            1-2 x: rxcddx
            8-12 g: gggggggggggmgg
            1-6 j: jjjjddjj
            8-11 z: zzszznzfzzz
            3-14 s: hwjszphhcwjmhsssc
            5-7 m: lpcnpsr
            5-6 f: frffplfffff
            4-7 m: msmkrmw
            4-10 s: vhlztshrspskv
            13-14 q: mqqgqmcpqpdrqn
            5-9 h: hhhmrhhhh
            4-6 r: lbqhmw
            5-6 b: mbzhbsbbhthll
            13-16 v: vvvvvvvvvvvvhvvdvvvf
            10-12 w: wwmwgwwzwpwv
            2-12 b: kpxbpfbfbcjfbkcfxmbb
            14-17 n: nngnnnnfnqnnnnnnrn
            6-10 h: hchhhhqhhxhhzj
            5-6 h: hzvnwb
            7-8 p: pnhxqpls
            4-5 z: zzztzz
            11-12 c: fclcctjcfdqrcps
            6-15 v: jgclvvsqkqgjkvvcl
            1-13 j: wjjjjjjjjjjjgj
            6-7 f: fffffmfzpf
            6-12 p: kppppgppzpptphxp
            13-14 b: bbbbbbbbbbbbbbbb
            18-20 f: ffffffffffffffmxftfv
            6-11 k: gfkkkctxmkrkp
            1-9 r: rrwvbwdtr
            8-18 b: bbbbbbbtbbbbbbbbbbb
            3-10 t: ftqgcktpthttztm
            5-8 j: jjzjjjtjlbhj
            2-6 w: hwkljw
            10-14 g: kggggggfrrgggxgg
            7-13 z: zjszqzxzdzzzkjzf
            1-6 p: ppppppppp
            8-9 p: pppppdpgqpppp
            13-15 g: gggggpsggggtggbg
            4-5 g: gpmsg
            2-5 z: vzfhzzhphh
            2-4 g: jgzq
            8-9 g: pgjggbbgf
            3-4 r: ljsnp
            7-13 x: xxxxxgxxxkxxxxvxkkxm
            2-6 g: nggfgw
            9-10 m: mmmmmmmmldm
            15-16 w: wwwwhwkwjnwwwwdn
            10-18 r: rrrrrrrrrrrrrrrrrkr
            2-3 q: qplq
            1-7 m: tmmmmsq
            2-5 w: swwmwk
            2-3 l: slgkdtjznfxdml
            10-12 q: qxmmqjqqqqqw
            12-14 c: bhlhjcwkcndchwc
            10-11 d: dddddsddddl
            13-14 g: mxdxkmvcgrsqgn
            3-4 t: qtttpmt
            14-16 b: bbbbbbbbbbbbbbbqbbb
            2-11 w: zdggnxfnzpwnf
            6-7 r: rfrcrrf
            9-10 h: hhhhhhhhfg
            7-8 r: rrrrrrvl
            8-9 n: rnsnvlrqdq
            4-7 f: ffwnzdf
            15-18 x: ngxxvqwxzlhxwpxxxz
            13-15 w: nwwwwwqwwwwwtww
        """.trimIndent()
    }
}

/**
 * DAY 3 PROBLEM 1
 */
object InputDay3Problem1 : Inputs() {
    override fun getInput(): String {
        return """
            ........#..#.##.#..............
...#...............#.#.........
...#..#...#..##....#...........
...#.............#....#.....#..
..#......#..#...#.......#......
..............##...............
#.......#.........#......#....#
.#.....###.....#...#.#.#...#...
#.....................#....#.#.
.......#...................#...
...#.#...................#....#
....#....#.......#...#.........
..##.#............#..#.........
.....##.#..............##..###.
...........#....#....#.........
#.....#...#...#.#.#.#.##.#...#.
.#...............#....##.......
.....#..#......#....#.......##.
.....#........#.......#........
...#...##...#..##...#.....##...
.....#.........#.###...##...#..
.#.##...#........#.#.#.#....#..
....#......##.#...#.....#....#.
.......###..........#..#..#....
......#...#.##.................
....#...#...#.........#......#.
.....#...........#...###....#..
.....#...#.#.#....##.#......#.#
......#...#.....#..#..#........
#......#..#...##........###....
##.....#....##..#.#.###.#...#..
........#....#.......#.....#..#
#.#.#.##.#.#...................
..#...##....#......#.....##....
.......#.##..#........##..#....
.#.#....##......#.#..........#.
#..............#............#..
.#.#.#.#.#.####.#.#...##.......
.#..#.....##.#.......#.##...#..
..#.#........#.............#.#.
..#.#..........#..#........#...
..#..#...#.......##...#.#....##
...#.....#.#.#.....#....#....#.
.#...#......#.....#..##........
...#.......##.#.#.....#......#.
...........#.....#.#.......#...
#...........#...#..#.#........#
....#......#..##........#..###.
.#..#........................#.
#.......#......#...#...#..#....
....#.#...#..#.#....#....##.#..
.....#......#..#..........##.#.
.#.....#...........#.........#.
...###.#...#.......#.#.........
.......#....#..........#..#...#
......##..#.......#...##.......
..#..........#.......#.........
..........#..#..#..#..#........
.#.................####...#.#.#
..##.....#............#........
....#.....###...#......#....#.#
...##.#...........#.##......#..
#..##..#..#....#...#..#........
......#....#........#.......#..
......#.....#......###.........
.#.....#.#......#.......#......
..#.........#..#..#........##.#
..#.#....#.....#....##....#.#..
...#.............##............
........#..#..#......#...#.....
.....#.#...#...##.....#.....#..
.#..#.#..........##...##.....#.
......##.#..........#...#.....#
#.#.##......#....#..........#..
................#.......#.##...
#.......#.....#.......#....#...
#..#.....#.##..##...........#..
.....#....#.#.##..........#..##
#.......#.....#.##...........#.
........#.##........###..#.#...
........#..................#...
#.........................#...#
....#.........#...#.#..#.....#.
.#............#....#...........
..#.#...#..##...#.#.......#....
.#.#....#...........#.........#
...#.#..........#.....#...#....
......#....#.#...............##
....##......###...##.##.....##.
............#.#....#.#.....#..#
.....#..#.....#.#...###....#...
.......##....##..#...##..#...##
.....#.......##..#...#...#....#
#.........##....#........###.#.
...#..##...#...#.........#.#.#.
....#.#.....#.....#............
#........#....#..#........#....
.......#....#...#..............
#...#.........##.....###.#.....
.#....##..#...#..##.........#..
....#.....#......##..#..#....#.
#.#..#.........#........#......
..#.......#.........#.....###..
..#..........#...........#....#
..#...............#......#..#..
....#..#...#....###.....#..#..#
#...#...#..#...........#....#..
.#....#.#..#....#.#...........#
.....#.....#..#....#..#....#...
#.#..#...........#.#...........
..................#.#.......#..
...#.........#.....#..##....#..
.........#.#...#.........##....
...#..#....#.....#...#..#......
.#.##.....#....#....#......##..
##..#.........#.#....#...#.....
#......#.#...#....#.#..#.......
.......#.....#.....###....#.#..
.#....##.#.....#...#.......#...
.#.......#..#...#......#..#..##
...............#...#...........
#..............#....#.#.#....#.
...........#..#.......#.##..#..
..#......#.#....#...#.#.....#..
#..............................
#..#....#..........#...#.......
......#.............#####......
.#...###......#.#.#.##..#......
............#.##.....#.........
.........#....##....#..........
###....#......#.......#........
.#.......##..........#..#....#.
#..#.....................#....#
........#...........#..........
..#..........#...#..#.........#
..#..#......##................#
.....##..#...#..#..............
.......#...##..#...............
.......##..#.####....#....#.#..
#.#..#..........#........##....
....##....#.#..#....#.#...#....
......#.......#...#.....#...#..
..#..#...#.....#.......###.....
...#.......#.#.#.......#.##....
...............#..#.#........#.
.#....###.#......#.............
.#..#...#....#.#..#.....#......
.......#.##....#.#.##.##...#.#.
..#...#....#.#..##.#.....#...##
..#...#......#...#......#...#..
....#..#...#.#..#......#.......
#..#...............#......#.##.
.#....#...#..........#.#.....#.
.#..#.#.#................#..#..
.#....#.#...#..##.###..#...###.
#.............#.....#.........#
...#.........#...#.......#..#..
......#..#.........#..........#
........##................#..#.
......#...#.#.....#......##....
...............#...#....#......
...#.#..#..#.....##.###..##..#.
.#....##......#...#..##..#.....
.....#.........##.##....#...#..
.....#.#..................####.
#.....#...#.............##....#
#.#..........#...#..#..#.......
#..#.#.........#...............
....#...#.........#...##.......
...........#.....#..##..#......
#.....#.......#.#........#.....
..##..#.....#...##......#......
....#....#.....................
............#......#.........##
.....##.............#.....##..#
.......#.............#..#.#.##.
.###...#......#..#........##.#.
..#.#...#.#....#.....#..#......
..#.#..#.##........#...#.......
........#.#...............#..#.
........##.......#...#.......#.
...#........##.#..........#.#.#
..#..###.#.#.......#.#......#..
....#..........#...#..#........
...#..#...#...#.#....#...#..#..
...#...#........#......##...#.#
#...........#..........#..#.##.
...#..##..................#.#..
...##.#...#....#.#...#.####....
.....#...#.#.#..#..............
.....#..#.#.#..#...............
..#..#..##...#.#..#.....##....#
.......#.#..#.....#....#.......
...#..#....#.........#...#.....
..............#.#...#...##.....
...................#...........
.#......#.#...................#
.##.....#........#.........#..#
.##..##...#...................#
...#....#.#..#.#.#..#.....##...
.......#..#....#......####.#...
.##..#..##....#.......#........
.#...#...........##............
.....#.....#........#..........
....##..#....#.....#...........
.#...#....................#....
....#.........#.......##.....#.
.#....#..#.....#.##....#.......
....#..#.........#.#....#.#....
.......#.........##....#.......
..#......#....#....#...#.......
........#..#.......#.##......#.
..#.....#......#...#..#.......#
#..#.....##...#...#............
.......##.......#........#...#.
..#......................#...#.
....##.#.............#......#..
#.#............................
...##.#.....#.#............#.##
......#...#..#.........##......
.#.......#.....##.......#.#....
...........#.#.........#..##...
...#..........#.##....#........
........#..#..#...#....#....#..
........##....#.#....#........#
..#........##....###....#......
#................###...#...#...
................#.#..###......#
..#.....##.#................#..
.....#...............#..#......
..#.......####.....#..#.#....##
..#.....#..#....#..............
#.#...........#.#.....#..##....
#.#..........#.......#...#.###.
........#....#...#..#.#........
.#.....#......#..#..#..###..#..
.#.........#.##.#.#......##....
..#.........#...##..#........#.
.#...................#.........
...#.#........#................
............#.....#..##........
..#.....#.#......#.......#...#.
........#....##..##...#.....##.
.#........#.#....#.#....#.#..#.
#.#.......#....................
.#..#...##.........#..#........
.........#...............#.....
...#...#.....#......#.......#..
###......................#.#..#
...#.....####........#..#.....#
#.#...#.#...................##.
.........#.....................
#..........##..#.....#....#....
.......#...#.#.##.#..##........
..........#..#.#..#.#.......#.#
.....................#.#...#...
...........#.#........#.#.#....
.......#......#........#...#.#.
.........#....................#
.##.##....#...#.#.#.#..........
#....##..#.##....#....#.......#
.##.#...#...............#....#.
.......#...#.###....#..........
.....#....#...#..#.............
#.........#.##....#.#.#........
..#...#.............##..#..#...
#..##.......#..........#...#.#.
.#..#.....#...........#......#.
......#......#..............##.
.#...#..#...#..####.....#.....#
....##.......#..........##.....
.#.....#.......#.....#.#...#...
..#..#..#.#...#......#.........
......#.#....#........#.......#
........#.......#..............
..#...#.#....#........#.......#
............#....#...##.#......
.........#.............#..#....
#.............#.#..##.......#..
#....#...........###....#......
...#.....................#.....
....#.#..........#...#.......#.
......#..#.......#...#...#....#
.#.#..#.....##.#........#......
...........#...#.#.............
...###............#...#..#.....
..#.#.......#...#.#..#.........
.#......##...........#.....#.##
.....##.....#....##...##.#.#...
..........#.#.#......#........#
..#.#........#....##....#.#....
.#....#...##...........#....#..
##......#...#.......#..........
.##...###..#...#......#..##.#.#
...........##.#..##...#.......#
..#..............##............
........#..#........#...#..#.#.
..#.............#......#...##..
#...##....#...#....#....#.#....
.#.#......#..##............#.#.
.....###.#....##....#....#.....
#.#.#..........#...#...#.#.#...
.....#.#...........####........
.....#....##...#.##..#......#..
#....#.......#.##.......#..#...
.....#.....#........#..........
.......#.......#...#.##......#.
...#.........##...#.#.#......##
#........#........#...#..#.....
.#......#.#......#.#...#....#..
#..#....##.....##..............
...#.##............#..........#
.....#.#....#..#.#............#
..#......#...###.##.......###..
........#....#.#.#.#...........
............#..#........#.....#
....#...............#..........
......#....#....###..#.......##
#...#...##....#.........#...#..
...........#.#.............#...
...#..#.....#..##.#....#......#
..#...#..#...#......#..........
....#..#....#.......#........#.
        """.trimIndent()
    }
}

/**
 * DAY 3 PROBLEM 2
 */
object InputDay3Problem2 : Inputs() {
    override fun getInput(): String {
        return """
........#..#.##.#..............
...#...............#.#.........
...#..#...#..##....#...........
...#.............#....#.....#..
..#......#..#...#.......#......
..............##...............
#.......#.........#......#....#
.#.....###.....#...#.#.#...#...
#.....................#....#.#.
.......#...................#...
...#.#...................#....#
....#....#.......#...#.........
..##.#............#..#.........
.....##.#..............##..###.
...........#....#....#.........
#.....#...#...#.#.#.#.##.#...#.
.#...............#....##.......
.....#..#......#....#.......##.
.....#........#.......#........
...#...##...#..##...#.....##...
.....#.........#.###...##...#..
.#.##...#........#.#.#.#....#..
....#......##.#...#.....#....#.
.......###..........#..#..#....
......#...#.##.................
....#...#...#.........#......#.
.....#...........#...###....#..
.....#...#.#.#....##.#......#.#
......#...#.....#..#..#........
#......#..#...##........###....
##.....#....##..#.#.###.#...#..
........#....#.......#.....#..#
#.#.#.##.#.#...................
..#...##....#......#.....##....
.......#.##..#........##..#....
.#.#....##......#.#..........#.
#..............#............#..
.#.#.#.#.#.####.#.#...##.......
.#..#.....##.#.......#.##...#..
..#.#........#.............#.#.
..#.#..........#..#........#...
..#..#...#.......##...#.#....##
...#.....#.#.#.....#....#....#.
.#...#......#.....#..##........
...#.......##.#.#.....#......#.
...........#.....#.#.......#...
#...........#...#..#.#........#
....#......#..##........#..###.
.#..#........................#.
#.......#......#...#...#..#....
....#.#...#..#.#....#....##.#..
.....#......#..#..........##.#.
.#.....#...........#.........#.
...###.#...#.......#.#.........
.......#....#..........#..#...#
......##..#.......#...##.......
..#..........#.......#.........
..........#..#..#..#..#........
.#.................####...#.#.#
..##.....#............#........
....#.....###...#......#....#.#
...##.#...........#.##......#..
#..##..#..#....#...#..#........
......#....#........#.......#..
......#.....#......###.........
.#.....#.#......#.......#......
..#.........#..#..#........##.#
..#.#....#.....#....##....#.#..
...#.............##............
........#..#..#......#...#.....
.....#.#...#...##.....#.....#..
.#..#.#..........##...##.....#.
......##.#..........#...#.....#
#.#.##......#....#..........#..
................#.......#.##...
#.......#.....#.......#....#...
#..#.....#.##..##...........#..
.....#....#.#.##..........#..##
#.......#.....#.##...........#.
........#.##........###..#.#...
........#..................#...
#.........................#...#
....#.........#...#.#..#.....#.
.#............#....#...........
..#.#...#..##...#.#.......#....
.#.#....#...........#.........#
...#.#..........#.....#...#....
......#....#.#...............##
....##......###...##.##.....##.
............#.#....#.#.....#..#
.....#..#.....#.#...###....#...
.......##....##..#...##..#...##
.....#.......##..#...#...#....#
#.........##....#........###.#.
...#..##...#...#.........#.#.#.
....#.#.....#.....#............
#........#....#..#........#....
.......#....#...#..............
#...#.........##.....###.#.....
.#....##..#...#..##.........#..
....#.....#......##..#..#....#.
#.#..#.........#........#......
..#.......#.........#.....###..
..#..........#...........#....#
..#...............#......#..#..
....#..#...#....###.....#..#..#
#...#...#..#...........#....#..
.#....#.#..#....#.#...........#
.....#.....#..#....#..#....#...
#.#..#...........#.#...........
..................#.#.......#..
...#.........#.....#..##....#..
.........#.#...#.........##....
...#..#....#.....#...#..#......
.#.##.....#....#....#......##..
##..#.........#.#....#...#.....
#......#.#...#....#.#..#.......
.......#.....#.....###....#.#..
.#....##.#.....#...#.......#...
.#.......#..#...#......#..#..##
...............#...#...........
#..............#....#.#.#....#.
...........#..#.......#.##..#..
..#......#.#....#...#.#.....#..
#..............................
#..#....#..........#...#.......
......#.............#####......
.#...###......#.#.#.##..#......
............#.##.....#.........
.........#....##....#..........
###....#......#.......#........
.#.......##..........#..#....#.
#..#.....................#....#
........#...........#..........
..#..........#...#..#.........#
..#..#......##................#
.....##..#...#..#..............
.......#...##..#...............
.......##..#.####....#....#.#..
#.#..#..........#........##....
....##....#.#..#....#.#...#....
......#.......#...#.....#...#..
..#..#...#.....#.......###.....
...#.......#.#.#.......#.##....
...............#..#.#........#.
.#....###.#......#.............
.#..#...#....#.#..#.....#......
.......#.##....#.#.##.##...#.#.
..#...#....#.#..##.#.....#...##
..#...#......#...#......#...#..
....#..#...#.#..#......#.......
#..#...............#......#.##.
.#....#...#..........#.#.....#.
.#..#.#.#................#..#..
.#....#.#...#..##.###..#...###.
#.............#.....#.........#
...#.........#...#.......#..#..
......#..#.........#..........#
........##................#..#.
......#...#.#.....#......##....
...............#...#....#......
...#.#..#..#.....##.###..##..#.
.#....##......#...#..##..#.....
.....#.........##.##....#...#..
.....#.#..................####.
#.....#...#.............##....#
#.#..........#...#..#..#.......
#..#.#.........#...............
....#...#.........#...##.......
...........#.....#..##..#......
#.....#.......#.#........#.....
..##..#.....#...##......#......
....#....#.....................
............#......#.........##
.....##.............#.....##..#
.......#.............#..#.#.##.
.###...#......#..#........##.#.
..#.#...#.#....#.....#..#......
..#.#..#.##........#...#.......
........#.#...............#..#.
........##.......#...#.......#.
...#........##.#..........#.#.#
..#..###.#.#.......#.#......#..
....#..........#...#..#........
...#..#...#...#.#....#...#..#..
...#...#........#......##...#.#
#...........#..........#..#.##.
...#..##..................#.#..
...##.#...#....#.#...#.####....
.....#...#.#.#..#..............
.....#..#.#.#..#...............
..#..#..##...#.#..#.....##....#
.......#.#..#.....#....#.......
...#..#....#.........#...#.....
..............#.#...#...##.....
...................#...........
.#......#.#...................#
.##.....#........#.........#..#
.##..##...#...................#
...#....#.#..#.#.#..#.....##...
.......#..#....#......####.#...
.##..#..##....#.......#........
.#...#...........##............
.....#.....#........#..........
....##..#....#.....#...........
.#...#....................#....
....#.........#.......##.....#.
.#....#..#.....#.##....#.......
....#..#.........#.#....#.#....
.......#.........##....#.......
..#......#....#....#...#.......
........#..#.......#.##......#.
..#.....#......#...#..#.......#
#..#.....##...#...#............
.......##.......#........#...#.
..#......................#...#.
....##.#.............#......#..
#.#............................
...##.#.....#.#............#.##
......#...#..#.........##......
.#.......#.....##.......#.#....
...........#.#.........#..##...
...#..........#.##....#........
........#..#..#...#....#....#..
........##....#.#....#........#
..#........##....###....#......
#................###...#...#...
................#.#..###......#
..#.....##.#................#..
.....#...............#..#......
..#.......####.....#..#.#....##
..#.....#..#....#..............
#.#...........#.#.....#..##....
#.#..........#.......#...#.###.
........#....#...#..#.#........
.#.....#......#..#..#..###..#..
.#.........#.##.#.#......##....
..#.........#...##..#........#.
.#...................#.........
...#.#........#................
............#.....#..##........
..#.....#.#......#.......#...#.
........#....##..##...#.....##.
.#........#.#....#.#....#.#..#.
#.#.......#....................
.#..#...##.........#..#........
.........#...............#.....
...#...#.....#......#.......#..
###......................#.#..#
...#.....####........#..#.....#
#.#...#.#...................##.
.........#.....................
#..........##..#.....#....#....
.......#...#.#.##.#..##........
..........#..#.#..#.#.......#.#
.....................#.#...#...
...........#.#........#.#.#....
.......#......#........#...#.#.
.........#....................#
.##.##....#...#.#.#.#..........
#....##..#.##....#....#.......#
.##.#...#...............#....#.
.......#...#.###....#..........
.....#....#...#..#.............
#.........#.##....#.#.#........
..#...#.............##..#..#...
#..##.......#..........#...#.#.
.#..#.....#...........#......#.
......#......#..............##.
.#...#..#...#..####.....#.....#
....##.......#..........##.....
.#.....#.......#.....#.#...#...
..#..#..#.#...#......#.........
......#.#....#........#.......#
........#.......#..............
..#...#.#....#........#.......#
............#....#...##.#......
.........#.............#..#....
#.............#.#..##.......#..
#....#...........###....#......
...#.....................#.....
....#.#..........#...#.......#.
......#..#.......#...#...#....#
.#.#..#.....##.#........#......
...........#...#.#.............
...###............#...#..#.....
..#.#.......#...#.#..#.........
.#......##...........#.....#.##
.....##.....#....##...##.#.#...
..........#.#.#......#........#
..#.#........#....##....#.#....
.#....#...##...........#....#..
##......#...#.......#..........
.##...###..#...#......#..##.#.#
...........##.#..##...#.......#
..#..............##............
........#..#........#...#..#.#.
..#.............#......#...##..
#...##....#...#....#....#.#....
.#.#......#..##............#.#.
.....###.#....##....#....#.....
#.#.#..........#...#...#.#.#...
.....#.#...........####........
.....#....##...#.##..#......#..
#....#.......#.##.......#..#...
.....#.....#........#..........
.......#.......#...#.##......#.
...#.........##...#.#.#......##
#........#........#...#..#.....
.#......#.#......#.#...#....#..
#..#....##.....##..............
...#.##............#..........#
.....#.#....#..#.#............#
..#......#...###.##.......###..
........#....#.#.#.#...........
............#..#........#.....#
....#...............#..........
......#....#....###..#.......##
#...#...##....#.........#...#..
...........#.#.............#...
...#..#.....#..##.#....#......#
..#...#..#...#......#..........
....#..#....#.......#........#.
        """.trimIndent()
    }
}

/**
 * DAY 4 PROBLEM 1
 */
object InputDay4Problem1 : Inputs() {
    override fun getInput(): String {
        return """
byr:1971
ecl:hzl pid:112040163
eyr:2023 iyr:2019
hcl:#b6652a hgt:167cm

pid:108667812 eyr:2023 hcl:#623a2f hgt:171cm iyr:2018 ecl:amb byr:1993

hcl:#cfa07d iyr:2014 ecl:blu eyr:2023 cid:304 hgt:70in byr:1961

byr:1977
hcl:#b6652a
iyr:2017 ecl:oth pid:703877876 hgt:185cm

byr:1972
cid:271
iyr:2016 pid:876104259 hgt:173cm eyr:2028 ecl:brn hcl:#733820

hgt:174cm ecl:gry iyr:2014 eyr:2029 hcl:#c0946f
byr:1967 pid:406306240

hcl:#6b5442
iyr:2011
pid:040592028 eyr:2026
ecl:amb
byr:1923

pid:293598838 byr:1960 cid:87
iyr:2018
ecl:blu eyr:2029
hcl:#7d3b0c
hgt:62in

iyr:2018 cid:137
hcl:1c7db1 ecl:#38812e byr:2006 eyr:2038 pid:1239811353 hgt:84

hcl:#888785 pid:308480529
iyr:2010 byr:1988
eyr:2025 hgt:176cm ecl:amb

cid:79 ecl:lzr
iyr:2013 byr:1991 hcl:2f49ef
hgt:191cm
pid:378428551

iyr:2005
hgt:64in hcl:89c369
ecl:gry byr:1932
eyr:2029 pid:753055776

ecl:amb iyr:2017
byr:1969 hcl:#fffffd
pid:305746470
hgt:173cm

pid:081972188 iyr:2011
hcl:9bb154
eyr:2024 byr:1966 ecl:oth cid:185 hgt:171cm

pid:522553186 hgt:171cm ecl:grn hcl:#7d3b0c
byr:1955
eyr:2025 iyr:1999

iyr:2015
byr:1941 pid:140123640 ecl:amb hgt:153cm hcl:#ceb3a1 eyr:2020

ecl:grn
cid:202 hcl:#602927
eyr:2029
hgt:180cm byr:1974
pid:658341964
iyr:2017

pid:2037156813 eyr:1978 ecl:grn hcl:519b45 iyr:2011 byr:2017

hcl:#fffffd ecl:hzl
pid:658716289 byr:2001 hgt:154cm cid:234 eyr:2031 iyr:2010

byr:2013 pid:#eb519e eyr:2026
hgt:157cm iyr:2030 hcl:7e9d5a ecl:oth

byr:2002
ecl:brn iyr:1998 hgt:60cm
hcl:#7d3b0c pid:#90286d
eyr:1938

byr:1956 hcl:#efcc98
hgt:190cm
iyr:2010 eyr:2023
ecl:amb
cid:342 pid:278521396

hgt:67cm
cid:98 eyr:2036 byr:2028 ecl:grt hcl:08b5ad iyr:2029 pid:187cm

ecl:dne hcl:fca461 hgt:129 iyr:2020 eyr:2027 byr:2022 pid:5014208295

hgt:169cm ecl:gry iyr:2015 eyr:2025 hcl:#733820 pid:240085824 byr:1920

iyr:2020 eyr:2033
pid:#3f8e9d hgt:190in ecl:brn hcl:#efcc98 byr:2004

iyr:2018 hcl:#18171d ecl:brn byr:1933
pid:514517439 hgt:171cm eyr:2028

eyr:2030 pid:053251865
byr:2028 hgt:174cm iyr:2015 hcl:5a0da9 ecl:hzl

hgt:169cm iyr:2014 ecl:oth eyr:2029 pid:348737413 hcl:#b6652a byr:1997

hgt:181cm cid:315
eyr:2021 iyr:2016 byr:1966 ecl:oth pid:779435812 hcl:#733820

pid:5052579 cid:268 hgt:193in
hcl:z
iyr:1942 eyr:1977

eyr:2039 hgt:69cm cid:337
iyr:2023 pid:568948965
byr:2018 hcl:z ecl:amb

byr:2014 eyr:2028
cid:311
pid:158cm ecl:#946399 hgt:99
hcl:z
iyr:1978

pid:474742310 iyr:2015 eyr:2021 hcl:#14f5da
hgt:163cm ecl:oth

hcl:#efcc98
ecl:blu
hgt:178cm pid:815309025 byr:2024
iyr:2008 eyr:1922

byr:1946 eyr:2028 pid:364439229 iyr:2011 hgt:186cm cid:79 ecl:blu

eyr:2028 hgt:157cm
cid:59 iyr:2010 byr:1927
ecl:brn
pid:893074368

hcl:#18171d ecl:#2defe4 hgt:128 byr:1940
pid:181904523 iyr:2022 eyr:1937

eyr:2023 hgt:172cm iyr:2012 hcl:#a97842 ecl:hzl byr:1982 pid:638759541

cid:91 hcl:#623a2f
byr:1996 eyr:2028 pid:181384347 hgt:175cm
iyr:2020

iyr:2017 eyr:2021 ecl:gry
byr:1979 hgt:168cm hcl:#6b5442 pid:950995084

ecl:blu iyr:2012 byr:1972
hcl:#888785 eyr:2022 hgt:179cm pid:293827532

hgt:179cm
ecl:hzl iyr:2011
byr:1982 eyr:2020 hcl:#efcc98 cid:209 pid:626732917

byr:1989
hcl:#6b5442 pid:679850983 iyr:2020
hgt:192cm ecl:blu

pid:333485773 hgt:167in ecl:zzz iyr:1945
eyr:2035 cid:319 hcl:#341e13

hgt:64in
cid:202 eyr:2023 ecl:gry hcl:#c0946f pid:212611149 byr:1928 iyr:2010

hgt:183cm hcl:#e8fa30 ecl:oth eyr:2021
byr:1943 pid:667658434
iyr:2010

cid:117
byr:2022 hcl:z ecl:#c6ae1f iyr:2028
hgt:188cm
pid:0883366415
eyr:2030

hcl:z
pid:99347800 iyr:2030 eyr:2032 ecl:#cd1fd7 hgt:192cm byr:2019

hgt:178cm byr:2013
iyr:2026 hcl:ad3da1
eyr:2020 pid:1626818790

hgt:63cm
iyr:1964
eyr:2032
cid:135 byr:2017 hcl:#a97842 pid:#1b83f5 ecl:gmt

hcl:c352d2 byr:1927 ecl:gmt hgt:187cm
eyr:2031 pid:170cm

byr:2022 eyr:1958 ecl:zzz pid:3692521800 hcl:8b2b50 iyr:1946 hgt:155in

ecl:#43f305 hcl:z byr:2028
pid:63518738 cid:243 eyr:2037
hgt:67cm iyr:1929

ecl:brn hcl:#888785
pid:495215177 byr:1962 eyr:2021
cid:192
hgt:151cm iyr:2012

ecl:#dcca8e cid:64 eyr:2030 pid:380057616
hcl:z iyr:2026 byr:1962

hcl:z
ecl:hzl eyr:2027 byr:2015 pid:302526406 hgt:175cm iyr:2017

byr:1966
cid:133 pid:9953651821 ecl:gry iyr:2020 hgt:152cm
hcl:#fffffd eyr:2026

hgt:191cm byr:1960 pid:752655640 hcl:#888785
cid:249 ecl:blu
iyr:2012 eyr:2028

pid:#c8c988 eyr:2027 hgt:157in hcl:z iyr:2025 byr:2019 ecl:zzz cid:195

hgt:96 pid:95381813 iyr:1950
hcl:#fffffd eyr:2026
byr:2010 cid:318
ecl:#48a819

eyr:2020
ecl:oth byr:1951 pid:080392492
iyr:2015 hcl:#6b5442 hgt:176cm

hgt:162cm pid:897792747 byr:1968
hcl:#ceb3a1 ecl:grn eyr:2026 iyr:2014

eyr:2038 hcl:cc324a byr:1983 ecl:brn
hgt:161 pid:#adf47f cid:208

iyr:2013 ecl:blu hcl:#866857 byr:1981 hgt:157cm eyr:2025 pid:216910202

hgt:152in byr:1990
iyr:2027 hcl:a4a3ae
ecl:#058ae2 eyr:2037 pid:646420120

ecl:oth byr:1982 eyr:2027 hgt:65in iyr:2019
hcl:#efcc98 cid:224
pid:854228141

pid:772612093
iyr:2027
hgt:175in byr:1981 hcl:c0b5a9 ecl:utc

hcl:#888785 iyr:2014 byr:1975
ecl:blu
pid:461319017 cid:229 eyr:2030 hgt:154cm

hgt:179cm eyr:2024
pid:192cm
iyr:2017 ecl:grt byr:1934 hcl:z cid:92

hcl:9c9409 iyr:2020 eyr:2030 hgt:156in
cid:189 pid:732321495
byr:1937 ecl:xry

eyr:2026 pid:092259220 byr:1943
iyr:2010 hgt:153cm hcl:#602927

byr:1925 hgt:180cm hcl:#888785 iyr:2014
pid:402548656 eyr:2023 ecl:hzl
cid:188

eyr:2020 pid:874307939 hcl:#3f85a4
ecl:gry hgt:167cm byr:1959 iyr:2014

eyr:2026 hgt:183cm iyr:2011 byr:1940 ecl:blu pid:810026000
cid:226 hcl:#866857

cid:292 ecl:grt hgt:72cm
byr:2009
iyr:2000 eyr:1946 hcl:7be409 pid:996363336

eyr:2027
iyr:2021
pid:632405666
byr:2027
ecl:#d83a36 hcl:z hgt:190in

cid:80
hgt:173cm
pid:735853952 ecl:gry hcl:#fffffd eyr:2025 iyr:2020 byr:1923

byr:1977
hcl:#733820
iyr:2020 ecl:#698d72 hgt:186cm pid:678869986 cid:67
eyr:2021

hgt:61cm iyr:2022 eyr:1972 hcl:979bcf byr:2023 pid:44037388 ecl:xry

eyr:2032 pid:193cm hcl:z
hgt:68cm byr:2016

byr:2008 cid:239
hcl:ddc745 eyr:2033 ecl:#6858b5 hgt:64cm iyr:2023
pid:89867524

iyr:2016 hgt:74in hcl:#18171d
byr:1959
ecl:blu
pid:848487392
eyr:2027

hgt:165in ecl:grn
byr:1960 eyr:2029
iyr:2017
hcl:#b6652a pid:096349067

eyr:2025 ecl:brn
pid:634481064 iyr:2015
hcl:#7d3b0c
byr:1943

ecl:grn eyr:2021
pid:34753212 cid:51 hgt:184 iyr:1970 byr:2012

eyr:1973 iyr:2014 cid:225
byr:2028 ecl:gmt
hgt:158cm
pid:#74f9b8 hcl:f6932a

hgt:168cm
hcl:#602927
pid:622067991 ecl:amb eyr:2025 iyr:2018

pid:791399958 byr:1956 eyr:2027 hcl:#602927
ecl:brn
iyr:2016 hgt:192cm

hgt:168cm iyr:2015 cid:115 ecl:#3fa48b eyr:2037 hcl:#1bf77b byr:1980 pid:947370470

iyr:2008
byr:2021 ecl:zzz
hcl:z hgt:109 pid:#fc2a91 cid:268 eyr:1957

byr:2018 hcl:fef19c iyr:2014 ecl:blu eyr:2023 cid:259 pid:193cm hgt:156

hcl:#b6652a
iyr:2023 byr:2021 hgt:153cm pid:934391984 eyr:2021 ecl:brn

pid:168cm hcl:b13f1e eyr:2038 iyr:2020 ecl:#7c0a6d hgt:169in

ecl:amb cid:170
pid:300188824 eyr:2024 byr:1954 hcl:#b6652a hgt:166cm
iyr:2013

ecl:brn
eyr:2023
hcl:#b6652a byr:1948 hgt:71in iyr:2015
pid:575973478

eyr:2026 hgt:180cm hcl:#866857 ecl:grn iyr:2013
byr:1997 pid:864648034

ecl:hzl
iyr:2013 eyr:2024 hcl:#02e17f byr:1960
hgt:163cm cid:338 pid:972201795

iyr:1994 eyr:2035 ecl:xry
hcl:z hgt:167in pid:159cm

ecl:hzl
byr:1952
eyr:2024 hgt:191cm pid:229400637 iyr:2011 hcl:#122db6

eyr:2022
pid:467667316 iyr:2019 hcl:#623a2f
hgt:161cm
ecl:oth

ecl:hzl eyr:2030 hcl:#733820 byr:1944
hgt:193cm pid:819137596

cid:321 hgt:184in ecl:hzl iyr:2018 byr:2010 eyr:2020 pid:171cm

ecl:amb eyr:2025 hcl:#c0946f pid:360891963 byr:1925
iyr:2017
hgt:180cm

hcl:#cfa07d byr:1949
eyr:1931 cid:350
ecl:#ff9943
pid:7550350393 hgt:75

eyr:2026 ecl:amb hcl:z pid:746919391 iyr:2014 hgt:179cm byr:1997

pid:157cm iyr:2030
hgt:152cm
hcl:ce8aa7 eyr:1976 ecl:grt cid:160 byr:2011

eyr:2022
hgt:183cm
byr:2000 iyr:2016 hcl:#a97842 ecl:blu pid:500935725

cid:245 eyr:2026 iyr:2015 ecl:gry hcl:#cfa07d
byr:1946

eyr:2022 hgt:168cm
pid:786361311 iyr:2013 hcl:#c0946f byr:1988 cid:244 ecl:hzl

byr:2014 hgt:176in iyr:2021
hcl:z pid:6361650130
eyr:2039 cid:300
ecl:#76310d

ecl:amb hgt:170in byr:2013
iyr:2024 eyr:2033 hcl:#888785

eyr:2025
iyr:1957 cid:182
ecl:blu pid:253552114
hgt:188cm hcl:z

cid:83 ecl:amb
eyr:2022 byr:1947
iyr:2013 hcl:#cfa07d
hgt:188cm pid:447734900

iyr:2013 hcl:#602927 byr:1979 hgt:167cm cid:321 pid:978238277 eyr:2020
ecl:grn

hgt:73cm
cid:199 ecl:amb iyr:2019
hcl:#733820 eyr:2021
byr:1939 pid:364966395

hgt:168in ecl:lzr eyr:2031
pid:#ff10ac byr:2014 iyr:2006

hgt:164cm eyr:1994 iyr:2010
ecl:amb hcl:#7d3b0c cid:240 pid:191cm
byr:2025

ecl:grn
eyr:2029
hcl:#7d3b0c hgt:158cm
byr:1939 iyr:2012 pid:855145518

iyr:2013 hcl:#ceb3a1
hgt:163cm eyr:2023 pid:761215570

hgt:154cm ecl:grn
iyr:2019 byr:1981 eyr:2021 hcl:#602927
cid:80 pid:427938374

eyr:2026 hgt:154cm cid:102 iyr:2012 pid:6632346648 ecl:amb
byr:2010 hcl:z

cid:302 iyr:2014
pid:161cm eyr:2037 byr:2026 ecl:gry hgt:60 hcl:9fb9e0

ecl:brn iyr:2015 pid:041582949 cid:180 byr:1938
hgt:158cm
hcl:#602927 eyr:2026

ecl:xry pid:#546891 hcl:#18171d hgt:71cm byr:1974
iyr:2018 eyr:2026

iyr:2015 eyr:2025 ecl:brn hgt:180cm hcl:#b6652a
byr:1938
pid:752379523

iyr:2020 ecl:grn hgt:179cm byr:1929
cid:103 hcl:#602927
pid:212212232

pid:262917603 ecl:gry iyr:2012 hcl:#fffffd hgt:165cm eyr:2022 byr:1965

byr:1960
eyr:2031 hgt:184in
pid:#ac1606 iyr:2013 hcl:#888785
cid:260 ecl:#7b2c3b

byr:1987
eyr:2025 cid:102
hgt:74in ecl:brn hcl:#4a6c75 pid:20220733 iyr:2028

eyr:2031 pid:823539963
iyr:1957
hgt:159cm byr:1953 ecl:oth cid:186 hcl:26d85f

ecl:gry iyr:2011
hgt:167cm hcl:#fffffd pid:001642707 eyr:2030 byr:1952

iyr:2029 ecl:grt
hcl:z byr:2011 hgt:64cm pid:37027672
eyr:1923

pid:021102096
eyr:2024 hgt:66 hcl:#a97842 byr:1922 ecl:gry iyr:2013

pid:166477382 ecl:oth byr:1982 iyr:2010 eyr:2020
hcl:#866857 hgt:60in

hcl:#7d3b0c
iyr:2018 pid:065652921 byr:1939
ecl:blu
hgt:180cm eyr:2028

ecl:amb iyr:2020 byr:1967 hcl:#fffffd eyr:2028 hgt:157cm

eyr:2029 hgt:185cm cid:85 hcl:z iyr:2014 pid:#1f4787 ecl:grn byr:2010

byr:1987 hcl:d397d9 iyr:2028
hgt:158cm pid:686994921 ecl:hzl

ecl:oth
byr:2008
pid:#db73d9 hgt:174cm hcl:#6b5442 iyr:1955 eyr:2028

eyr:2020 ecl:amb pid:490866828 hcl:#cfa07d cid:113
hgt:165cm

iyr:2011
pid:320518492
eyr:2028 byr:1940 hgt:164cm cid:84
hcl:#341e13 ecl:grn

hgt:142
hcl:z pid:152cm iyr:1953 eyr:2040 ecl:#e44f11 byr:2024

ecl:gmt hcl:be7483 eyr:2027
iyr:2026
pid:396722617 hgt:153cm

ecl:dne byr:2015
pid:330208482
hcl:#7d3b0c iyr:2014 eyr:2022 hgt:95

byr:1925 hcl:#7d3b0c
ecl:gry
eyr:2024
pid:694714722 hgt:158cm iyr:2015 cid:283

eyr:2023
hgt:183cm cid:345
hcl:#6b5442 ecl:hzl iyr:2019 byr:1971 pid:458416257

ecl:#dcae8b
iyr:2027 eyr:1940 byr:2009 hcl:f024de pid:20713584
hgt:169in

hcl:#888785 eyr:2026
byr:1984 iyr:2013 pid:935837461
hgt:193cm
ecl:gry

pid:7343429 byr:2002
hgt:191cm
ecl:lzr iyr:1983
eyr:1966 hcl:#623a2f
cid:302

hcl:#888785 iyr:2014 hgt:173cm
byr:2002 pid:005350165 eyr:2022

byr:2013 iyr:2028
ecl:lzr pid:5426915565 eyr:2018 hcl:z hgt:70cm cid:142

eyr:2021 hgt:157cm ecl:utc iyr:2014
byr:1934 cid:348 hcl:#623a2f pid:607329117

iyr:2015 hgt:167cm ecl:hzl
pid:088516395 hcl:#efcc98 byr:1968 eyr:2029

eyr:2028
iyr:2019
cid:199
ecl:amb
hgt:152cm byr:1928 pid:547112666 hcl:#623a2f

pid:406202463
byr:1950 cid:214
eyr:2021 hcl:#fffffd hgt:177cm
ecl:brn

eyr:2029
cid:210 byr:1982 pid:578085789 ecl:brn
hgt:187cm iyr:2010 hcl:#c0946f

byr:1980 hcl:#c0946f hgt:159cm pid:177650318 eyr:2024 ecl:amb iyr:2019

pid:923359071 byr:1997 ecl:#faa530
eyr:2028 iyr:2013 hcl:e6c902 hgt:177cm

eyr:2040
cid:98 hgt:156in
ecl:oth
iyr:1996 pid:81500971
hcl:#6b5442
byr:2017

byr:2004 iyr:1941
hcl:e1e4bb hgt:67cm pid:1143915351 ecl:#0d3e5d eyr:1972

hgt:184cm hcl:#623a2f
eyr:2028 pid:680951513 ecl:grn iyr:2014 byr:2001

hcl:#866857 hgt:156cm
eyr:2020
ecl:grn iyr:2010 pid:589945116

pid:599795227 iyr:2016 ecl:grn
hcl:#cfa07d hgt:157cm byr:1967 eyr:2029

hcl:#b6652a
byr:1966 iyr:2017 pid:117232314 ecl:oth hgt:186cm eyr:2029

pid:605019880
iyr:2020
hgt:169cm byr:1980 hcl:#623a2f
ecl:hzl eyr:2030

eyr:2019 hcl:#ceb3a1 pid:988269284
iyr:2015 byr:1989 hgt:171cm ecl:oth

cid:311 byr:1998 ecl:hzl
eyr:2027 hgt:152cm pid:734870801 hcl:#7d3b0c
iyr:2013

hcl:#efcc98
hgt:180cm iyr:2020
pid:202682423 byr:2027 ecl:grn eyr:2030

hcl:f0701f pid:161cm cid:291 hgt:160in iyr:2030
ecl:#e12345

cid:248 byr:1943 eyr:2024 hgt:181cm ecl:brn iyr:2010 hcl:#bf813e

byr:2005 hgt:187in eyr:2034 iyr:2025 hcl:z ecl:gmt
pid:78691465

byr:2000
hcl:#574f4e eyr:2024 iyr:2017 pid:#fec795 hgt:185cm ecl:gry

hcl:#a97842 byr:1959
iyr:2019 pid:690444949
hgt:160in eyr:1978

cid:236
iyr:2010 eyr:2025 byr:1976 pid:398376853
hcl:#341e13
hgt:150cm

hgt:182cm iyr:2019 hcl:#866857
ecl:grn
byr:1926 eyr:2029 pid:307880154 cid:94

ecl:blu
hgt:182cm pid:178cm byr:2019 eyr:2025
iyr:2022 hcl:#a2117d

eyr:2020 hcl:#c0946f ecl:amb pid:135511825 byr:1954 hgt:68in iyr:2017

hgt:188cm ecl:amb iyr:2011
pid:949021029 eyr:2028 hcl:#fffffd byr:1986

iyr:1949 pid:#8a8d94 ecl:#922a92 byr:1925 hcl:#63c4a5

hcl:#c0946f
ecl:grn iyr:2013 eyr:2024 pid:420295283 hgt:181cm
byr:1977

byr:1941 pid:299186098 hcl:#f1fa72
iyr:2013 ecl:amb eyr:2022 hgt:152cm
cid:150

ecl:blu eyr:2021 hgt:60in hcl:#623a2f
byr:1930 iyr:2018

eyr:2028 pid:663108638
hgt:75in cid:217
byr:1962 ecl:brn hcl:#733820

hcl:#341e13 hgt:188cm ecl:blu
pid:868930517
eyr:2029
iyr:2010 byr:1938

pid:194376910 byr:1956
hcl:#cd4ab4
eyr:1940 iyr:2012 ecl:#396cc3

pid:#c5da2a hgt:162cm
hcl:#866857
cid:95 ecl:#fa1f85
iyr:1965 byr:1963 eyr:2039

pid:44063430 hcl:289b20
ecl:#77ddd9 eyr:1953
iyr:1924 byr:2026 cid:267 hgt:180in

ecl:brn pid:990171473
eyr:2028 byr:1937
hgt:165cm iyr:2015
hcl:#fffffd cid:68

iyr:1968 ecl:lzr pid:#05a4ab eyr:1944 hcl:z

hgt:185cm hcl:#7d3b0c eyr:2029 ecl:oth
iyr:2016 byr:1997 pid:349316183

hcl:z
ecl:gry
hgt:192in pid:542996841 iyr:2019 cid:144 eyr:2028
byr:2026

eyr:2024
hcl:#18171d
ecl:grn hgt:160cm pid:399767457 byr:1979 iyr:2015

ecl:#924147 pid:665314 cid:216 iyr:2026 hcl:z
byr:2023 hgt:157
eyr:1987

eyr:1989 hcl:4f8779 ecl:#05ff52 iyr:1943 pid:3693010880 hgt:72cm
byr:2009

hcl:#c0946f eyr:2022
iyr:2015 hgt:157cm byr:1928 ecl:grn pid:243566446

eyr:2030
hcl:#733820 byr:1988 iyr:2017 cid:125 hgt:193cm ecl:amb pid:939550667

cid:161 hgt:157in
hcl:#cfa07d eyr:2036 ecl:#4efa35
iyr:2012 pid:3943280550 byr:1979

ecl:lzr hcl:#341e13 hgt:69cm eyr:2026 cid:322 byr:2006 pid:827964469

ecl:amb iyr:2012
eyr:2020 hgt:178cm pid:590705772 cid:218
hcl:#c0946f byr:1922

hcl:632b01 cid:252 byr:1933 ecl:hzl
iyr:2025 eyr:2040 hgt:191cm
pid:406010613

pid:711656819 ecl:blu eyr:2030 hgt:151cm
byr:1999 cid:319
hcl:#efcc98

pid:294223216 iyr:2012
hgt:171cm
eyr:2027
hcl:#ceb3a1 ecl:oth
byr:1952 cid:58

hcl:#888785 pid:457433756 eyr:2022 hgt:186cm
cid:336
byr:1923 iyr:2013 ecl:oth

byr:2014 hcl:6ce7d6 eyr:2030 pid:190cm iyr:2018 hgt:63cm ecl:#5063b9

cid:267 hgt:189cm
eyr:2020 hcl:#ffeffd iyr:2014 byr:1989
ecl:grn
pid:571696542

iyr:1953 hgt:160in
ecl:grt cid:188 eyr:2034
pid:179cm byr:2007
hcl:6895eb

hgt:165cm ecl:oth
iyr:2020
eyr:2028
hcl:#18171d pid:111506895

eyr:1957 cid:133 ecl:hzl pid:#e56ca2 byr:2003 hcl:8a9d65

hcl:6c4ecd byr:1930 hgt:179cm
eyr:2007 iyr:2028 ecl:#3d8705
pid:#dbfeec

eyr:2036
byr:1991 ecl:#2202d0 hcl:#341e13 pid:85636989 hgt:61cm
iyr:1930

byr:1996 iyr:2027 hcl:z
pid:780164868 ecl:zzz eyr:2026 hgt:73cm

byr:1940
iyr:1992 pid:132016954 eyr:2021
cid:147 hcl:#d78bfd ecl:xry

hgt:174cm
byr:1970
eyr:2021 hcl:#341e13 pid:086579106 iyr:2017 ecl:oth

ecl:oth cid:207 byr:1998 pid:479696359
hgt:174cm iyr:2017 eyr:2020 hcl:#6b5442

ecl:hzl iyr:2014
hcl:#cfa07d hgt:163cm eyr:2025
byr:1951 pid:563337128

ecl:gry hgt:172cm iyr:2013 hcl:#efcc98
byr:1970
pid:848996674
eyr:2027

hgt:163cm pid:583600660 iyr:2015 hcl:#18171d byr:1959 ecl:brn

hcl:#efcc98 pid:353178375 cid:145
iyr:2018 byr:1988 ecl:oth eyr:2029

hgt:62in
byr:1921 pid:125944934 hcl:#b6652a
eyr:2025 cid:71 iyr:2018 ecl:blu

iyr:2017 ecl:brn hcl:#602927 hgt:172cm pid:932690969 byr:1957 eyr:2026

hcl:#efcc98 pid:709772213 cid:146 ecl:oth byr:1998 iyr:2010 hgt:74in
eyr:2029

byr:1965
iyr:2011 hcl:#6b5442 cid:325 hgt:68in eyr:2028 pid:813272708 ecl:hzl

pid:57223084 hcl:#602927 ecl:grn
hgt:156cm eyr:1972 iyr:2017

pid:21573000 byr:2030 cid:168
hcl:baee61 eyr:2021 hgt:150cm
iyr:1950 ecl:#acdd7e

ecl:gry hgt:150cm hcl:#6b5442
byr:1927
iyr:2018 pid:161cm eyr:2021

hgt:153cm
iyr:2030 ecl:grn pid:575037626 byr:1921 eyr:2021 hcl:#866857

hgt:175cm iyr:2014
byr:1946 eyr:2025
cid:159 hcl:#18171d
ecl:oth pid:129913905

pid:566885568
hgt:157cm eyr:2021 ecl:gry byr:1933
hcl:#623a2f cid:223

ecl:blu byr:1981 cid:160
iyr:2014
hcl:#a97842 eyr:2021 hgt:172cm pid:714902414

hcl:#b6652a eyr:2021
hgt:168cm byr:1921 iyr:2018 ecl:oth pid:021318713

hgt:168 pid:222439573
cid:209
hcl:z byr:2016 ecl:#26a0fb
eyr:2031

hgt:181cm
byr:1970 eyr:2024
pid:476171876 ecl:hzl
hcl:#efcc98
iyr:2019

hcl:#18171d ecl:oth iyr:2018 byr:1949 hgt:165cm
eyr:2029 pid:078204562

byr:2021 ecl:blu iyr:1963
pid:2911597977 hcl:#ceb3a1 eyr:2020
hgt:154cm

pid:159642237
hcl:#81e94d ecl:gry eyr:2028 byr:1958

hgt:90 hcl:#a97842 pid:#db1158
iyr:1928 ecl:#c82a43 byr:1971 eyr:2036

eyr:2020
hgt:177cm iyr:2013
cid:347 ecl:grn
byr:1998 pid:455369144

byr:1936
pid:444305229 iyr:2013 eyr:2025 hcl:#733820
ecl:gry
hgt:175cm

byr:2027 hcl:z
hgt:61cm ecl:brn pid:836686228 eyr:2023 iyr:2030

byr:1931
ecl:hzl hgt:168cm eyr:2023 pid:956562488 hcl:#fffffd

ecl:#4126e5 pid:182cm iyr:2021
hgt:144 eyr:2039 hcl:z

pid:321400085 hcl:#733820 hgt:189cm
ecl:hzl byr:1923 eyr:2023 iyr:2016

iyr:2011 hgt:192cm hcl:#b6652a byr:1988 pid:998875769
ecl:#e612d9 eyr:2015

eyr:2021 iyr:2011 pid:265966660
byr:1934 hgt:180cm
hcl:#7d3b0c
ecl:gry cid:225

pid:550612542 ecl:oth byr:1931
iyr:2014 cid:99
hcl:#cfa07d hgt:163cm eyr:2026

ecl:gry hgt:156cm iyr:2018 hcl:#5d9d64 pid:295386055 byr:1996
eyr:2025

ecl:gry iyr:2013 pid:855457285 cid:309 eyr:2030
hcl:#733820 byr:1973

eyr:2030 pid:86472746 ecl:blu
hgt:192cm
iyr:2013 byr:1939 hcl:#b6652a

hcl:#888785
byr:1935
iyr:2018
hgt:155cm ecl:grn
pid:612879095 cid:108 eyr:2027

eyr:2016 hcl:z pid:025915371 iyr:2010 hgt:183cm ecl:gry
byr:2010
cid:228

hcl:#38dbf4
byr:1925 ecl:amb eyr:2020 pid:065102805 iyr:2018

cid:244 hgt:171cm
hcl:#cfa07d pid:466737179 eyr:2025
byr:1937 iyr:2020 ecl:oth

ecl:brn byr:1993 hgt:179cm hcl:#341e13 pid:855375268 eyr:2028
iyr:2018

pid:809135189 iyr:2020 hgt:162cm eyr:2027
hcl:#888785 byr:1988 ecl:grn

byr:2003 pid:4446708453
hgt:188cm iyr:2013 hcl:#888785 ecl:blu eyr:2008

hgt:165in ecl:#db642f iyr:2014
eyr:2020
byr:1955 hcl:371f72 pid:756089060

ecl:lzr
hgt:177in eyr:2037 pid:175cm
byr:2023 hcl:03b398 iyr:2026

iyr:2017 ecl:blu byr:1942 hcl:#733820 eyr:2023 hgt:151cm pid:289923625
        """.trimIndent()
    }
}

/**
 * DAY 4 PROBLEM 2
 */
object InputDay4Problem2 : Inputs() {
    override fun getInput(): String {
        return """
byr:1971
ecl:hzl pid:112040163
eyr:2023 iyr:2019
hcl:#b6652a hgt:167cm

pid:108667812 eyr:2023 hcl:#623a2f hgt:171cm iyr:2018 ecl:amb byr:1993

hcl:#cfa07d iyr:2014 ecl:blu eyr:2023 cid:304 hgt:70in byr:1961

byr:1977
hcl:#b6652a
iyr:2017 ecl:oth pid:703877876 hgt:185cm

byr:1972
cid:271
iyr:2016 pid:876104259 hgt:173cm eyr:2028 ecl:brn hcl:#733820

hgt:174cm ecl:gry iyr:2014 eyr:2029 hcl:#c0946f
byr:1967 pid:406306240

hcl:#6b5442
iyr:2011
pid:040592028 eyr:2026
ecl:amb
byr:1923

pid:293598838 byr:1960 cid:87
iyr:2018
ecl:blu eyr:2029
hcl:#7d3b0c
hgt:62in

iyr:2018 cid:137
hcl:1c7db1 ecl:#38812e byr:2006 eyr:2038 pid:1239811353 hgt:84

hcl:#888785 pid:308480529
iyr:2010 byr:1988
eyr:2025 hgt:176cm ecl:amb

cid:79 ecl:lzr
iyr:2013 byr:1991 hcl:2f49ef
hgt:191cm
pid:378428551

iyr:2005
hgt:64in hcl:89c369
ecl:gry byr:1932
eyr:2029 pid:753055776

ecl:amb iyr:2017
byr:1969 hcl:#fffffd
pid:305746470
hgt:173cm

pid:081972188 iyr:2011
hcl:9bb154
eyr:2024 byr:1966 ecl:oth cid:185 hgt:171cm

pid:522553186 hgt:171cm ecl:grn hcl:#7d3b0c
byr:1955
eyr:2025 iyr:1999

iyr:2015
byr:1941 pid:140123640 ecl:amb hgt:153cm hcl:#ceb3a1 eyr:2020

ecl:grn
cid:202 hcl:#602927
eyr:2029
hgt:180cm byr:1974
pid:658341964
iyr:2017

pid:2037156813 eyr:1978 ecl:grn hcl:519b45 iyr:2011 byr:2017

hcl:#fffffd ecl:hzl
pid:658716289 byr:2001 hgt:154cm cid:234 eyr:2031 iyr:2010

byr:2013 pid:#eb519e eyr:2026
hgt:157cm iyr:2030 hcl:7e9d5a ecl:oth

byr:2002
ecl:brn iyr:1998 hgt:60cm
hcl:#7d3b0c pid:#90286d
eyr:1938

byr:1956 hcl:#efcc98
hgt:190cm
iyr:2010 eyr:2023
ecl:amb
cid:342 pid:278521396

hgt:67cm
cid:98 eyr:2036 byr:2028 ecl:grt hcl:08b5ad iyr:2029 pid:187cm

ecl:dne hcl:fca461 hgt:129 iyr:2020 eyr:2027 byr:2022 pid:5014208295

hgt:169cm ecl:gry iyr:2015 eyr:2025 hcl:#733820 pid:240085824 byr:1920

iyr:2020 eyr:2033
pid:#3f8e9d hgt:190in ecl:brn hcl:#efcc98 byr:2004

iyr:2018 hcl:#18171d ecl:brn byr:1933
pid:514517439 hgt:171cm eyr:2028

eyr:2030 pid:053251865
byr:2028 hgt:174cm iyr:2015 hcl:5a0da9 ecl:hzl

hgt:169cm iyr:2014 ecl:oth eyr:2029 pid:348737413 hcl:#b6652a byr:1997

hgt:181cm cid:315
eyr:2021 iyr:2016 byr:1966 ecl:oth pid:779435812 hcl:#733820

pid:5052579 cid:268 hgt:193in
hcl:z
iyr:1942 eyr:1977

eyr:2039 hgt:69cm cid:337
iyr:2023 pid:568948965
byr:2018 hcl:z ecl:amb

byr:2014 eyr:2028
cid:311
pid:158cm ecl:#946399 hgt:99
hcl:z
iyr:1978

pid:474742310 iyr:2015 eyr:2021 hcl:#14f5da
hgt:163cm ecl:oth

hcl:#efcc98
ecl:blu
hgt:178cm pid:815309025 byr:2024
iyr:2008 eyr:1922

byr:1946 eyr:2028 pid:364439229 iyr:2011 hgt:186cm cid:79 ecl:blu

eyr:2028 hgt:157cm
cid:59 iyr:2010 byr:1927
ecl:brn
pid:893074368

hcl:#18171d ecl:#2defe4 hgt:128 byr:1940
pid:181904523 iyr:2022 eyr:1937

eyr:2023 hgt:172cm iyr:2012 hcl:#a97842 ecl:hzl byr:1982 pid:638759541

cid:91 hcl:#623a2f
byr:1996 eyr:2028 pid:181384347 hgt:175cm
iyr:2020

iyr:2017 eyr:2021 ecl:gry
byr:1979 hgt:168cm hcl:#6b5442 pid:950995084

ecl:blu iyr:2012 byr:1972
hcl:#888785 eyr:2022 hgt:179cm pid:293827532

hgt:179cm
ecl:hzl iyr:2011
byr:1982 eyr:2020 hcl:#efcc98 cid:209 pid:626732917

byr:1989
hcl:#6b5442 pid:679850983 iyr:2020
hgt:192cm ecl:blu

pid:333485773 hgt:167in ecl:zzz iyr:1945
eyr:2035 cid:319 hcl:#341e13

hgt:64in
cid:202 eyr:2023 ecl:gry hcl:#c0946f pid:212611149 byr:1928 iyr:2010

hgt:183cm hcl:#e8fa30 ecl:oth eyr:2021
byr:1943 pid:667658434
iyr:2010

cid:117
byr:2022 hcl:z ecl:#c6ae1f iyr:2028
hgt:188cm
pid:0883366415
eyr:2030

hcl:z
pid:99347800 iyr:2030 eyr:2032 ecl:#cd1fd7 hgt:192cm byr:2019

hgt:178cm byr:2013
iyr:2026 hcl:ad3da1
eyr:2020 pid:1626818790

hgt:63cm
iyr:1964
eyr:2032
cid:135 byr:2017 hcl:#a97842 pid:#1b83f5 ecl:gmt

hcl:c352d2 byr:1927 ecl:gmt hgt:187cm
eyr:2031 pid:170cm

byr:2022 eyr:1958 ecl:zzz pid:3692521800 hcl:8b2b50 iyr:1946 hgt:155in

ecl:#43f305 hcl:z byr:2028
pid:63518738 cid:243 eyr:2037
hgt:67cm iyr:1929

ecl:brn hcl:#888785
pid:495215177 byr:1962 eyr:2021
cid:192
hgt:151cm iyr:2012

ecl:#dcca8e cid:64 eyr:2030 pid:380057616
hcl:z iyr:2026 byr:1962

hcl:z
ecl:hzl eyr:2027 byr:2015 pid:302526406 hgt:175cm iyr:2017

byr:1966
cid:133 pid:9953651821 ecl:gry iyr:2020 hgt:152cm
hcl:#fffffd eyr:2026

hgt:191cm byr:1960 pid:752655640 hcl:#888785
cid:249 ecl:blu
iyr:2012 eyr:2028

pid:#c8c988 eyr:2027 hgt:157in hcl:z iyr:2025 byr:2019 ecl:zzz cid:195

hgt:96 pid:95381813 iyr:1950
hcl:#fffffd eyr:2026
byr:2010 cid:318
ecl:#48a819

eyr:2020
ecl:oth byr:1951 pid:080392492
iyr:2015 hcl:#6b5442 hgt:176cm

hgt:162cm pid:897792747 byr:1968
hcl:#ceb3a1 ecl:grn eyr:2026 iyr:2014

eyr:2038 hcl:cc324a byr:1983 ecl:brn
hgt:161 pid:#adf47f cid:208

iyr:2013 ecl:blu hcl:#866857 byr:1981 hgt:157cm eyr:2025 pid:216910202

hgt:152in byr:1990
iyr:2027 hcl:a4a3ae
ecl:#058ae2 eyr:2037 pid:646420120

ecl:oth byr:1982 eyr:2027 hgt:65in iyr:2019
hcl:#efcc98 cid:224
pid:854228141

pid:772612093
iyr:2027
hgt:175in byr:1981 hcl:c0b5a9 ecl:utc

hcl:#888785 iyr:2014 byr:1975
ecl:blu
pid:461319017 cid:229 eyr:2030 hgt:154cm

hgt:179cm eyr:2024
pid:192cm
iyr:2017 ecl:grt byr:1934 hcl:z cid:92

hcl:9c9409 iyr:2020 eyr:2030 hgt:156in
cid:189 pid:732321495
byr:1937 ecl:xry

eyr:2026 pid:092259220 byr:1943
iyr:2010 hgt:153cm hcl:#602927

byr:1925 hgt:180cm hcl:#888785 iyr:2014
pid:402548656 eyr:2023 ecl:hzl
cid:188

eyr:2020 pid:874307939 hcl:#3f85a4
ecl:gry hgt:167cm byr:1959 iyr:2014

eyr:2026 hgt:183cm iyr:2011 byr:1940 ecl:blu pid:810026000
cid:226 hcl:#866857

cid:292 ecl:grt hgt:72cm
byr:2009
iyr:2000 eyr:1946 hcl:7be409 pid:996363336

eyr:2027
iyr:2021
pid:632405666
byr:2027
ecl:#d83a36 hcl:z hgt:190in

cid:80
hgt:173cm
pid:735853952 ecl:gry hcl:#fffffd eyr:2025 iyr:2020 byr:1923

byr:1977
hcl:#733820
iyr:2020 ecl:#698d72 hgt:186cm pid:678869986 cid:67
eyr:2021

hgt:61cm iyr:2022 eyr:1972 hcl:979bcf byr:2023 pid:44037388 ecl:xry

eyr:2032 pid:193cm hcl:z
hgt:68cm byr:2016

byr:2008 cid:239
hcl:ddc745 eyr:2033 ecl:#6858b5 hgt:64cm iyr:2023
pid:89867524

iyr:2016 hgt:74in hcl:#18171d
byr:1959
ecl:blu
pid:848487392
eyr:2027

hgt:165in ecl:grn
byr:1960 eyr:2029
iyr:2017
hcl:#b6652a pid:096349067

eyr:2025 ecl:brn
pid:634481064 iyr:2015
hcl:#7d3b0c
byr:1943

ecl:grn eyr:2021
pid:34753212 cid:51 hgt:184 iyr:1970 byr:2012

eyr:1973 iyr:2014 cid:225
byr:2028 ecl:gmt
hgt:158cm
pid:#74f9b8 hcl:f6932a

hgt:168cm
hcl:#602927
pid:622067991 ecl:amb eyr:2025 iyr:2018

pid:791399958 byr:1956 eyr:2027 hcl:#602927
ecl:brn
iyr:2016 hgt:192cm

hgt:168cm iyr:2015 cid:115 ecl:#3fa48b eyr:2037 hcl:#1bf77b byr:1980 pid:947370470

iyr:2008
byr:2021 ecl:zzz
hcl:z hgt:109 pid:#fc2a91 cid:268 eyr:1957

byr:2018 hcl:fef19c iyr:2014 ecl:blu eyr:2023 cid:259 pid:193cm hgt:156

hcl:#b6652a
iyr:2023 byr:2021 hgt:153cm pid:934391984 eyr:2021 ecl:brn

pid:168cm hcl:b13f1e eyr:2038 iyr:2020 ecl:#7c0a6d hgt:169in

ecl:amb cid:170
pid:300188824 eyr:2024 byr:1954 hcl:#b6652a hgt:166cm
iyr:2013

ecl:brn
eyr:2023
hcl:#b6652a byr:1948 hgt:71in iyr:2015
pid:575973478

eyr:2026 hgt:180cm hcl:#866857 ecl:grn iyr:2013
byr:1997 pid:864648034

ecl:hzl
iyr:2013 eyr:2024 hcl:#02e17f byr:1960
hgt:163cm cid:338 pid:972201795

iyr:1994 eyr:2035 ecl:xry
hcl:z hgt:167in pid:159cm

ecl:hzl
byr:1952
eyr:2024 hgt:191cm pid:229400637 iyr:2011 hcl:#122db6

eyr:2022
pid:467667316 iyr:2019 hcl:#623a2f
hgt:161cm
ecl:oth

ecl:hzl eyr:2030 hcl:#733820 byr:1944
hgt:193cm pid:819137596

cid:321 hgt:184in ecl:hzl iyr:2018 byr:2010 eyr:2020 pid:171cm

ecl:amb eyr:2025 hcl:#c0946f pid:360891963 byr:1925
iyr:2017
hgt:180cm

hcl:#cfa07d byr:1949
eyr:1931 cid:350
ecl:#ff9943
pid:7550350393 hgt:75

eyr:2026 ecl:amb hcl:z pid:746919391 iyr:2014 hgt:179cm byr:1997

pid:157cm iyr:2030
hgt:152cm
hcl:ce8aa7 eyr:1976 ecl:grt cid:160 byr:2011

eyr:2022
hgt:183cm
byr:2000 iyr:2016 hcl:#a97842 ecl:blu pid:500935725

cid:245 eyr:2026 iyr:2015 ecl:gry hcl:#cfa07d
byr:1946

eyr:2022 hgt:168cm
pid:786361311 iyr:2013 hcl:#c0946f byr:1988 cid:244 ecl:hzl

byr:2014 hgt:176in iyr:2021
hcl:z pid:6361650130
eyr:2039 cid:300
ecl:#76310d

ecl:amb hgt:170in byr:2013
iyr:2024 eyr:2033 hcl:#888785

eyr:2025
iyr:1957 cid:182
ecl:blu pid:253552114
hgt:188cm hcl:z

cid:83 ecl:amb
eyr:2022 byr:1947
iyr:2013 hcl:#cfa07d
hgt:188cm pid:447734900

iyr:2013 hcl:#602927 byr:1979 hgt:167cm cid:321 pid:978238277 eyr:2020
ecl:grn

hgt:73cm
cid:199 ecl:amb iyr:2019
hcl:#733820 eyr:2021
byr:1939 pid:364966395

hgt:168in ecl:lzr eyr:2031
pid:#ff10ac byr:2014 iyr:2006

hgt:164cm eyr:1994 iyr:2010
ecl:amb hcl:#7d3b0c cid:240 pid:191cm
byr:2025

ecl:grn
eyr:2029
hcl:#7d3b0c hgt:158cm
byr:1939 iyr:2012 pid:855145518

iyr:2013 hcl:#ceb3a1
hgt:163cm eyr:2023 pid:761215570

hgt:154cm ecl:grn
iyr:2019 byr:1981 eyr:2021 hcl:#602927
cid:80 pid:427938374

eyr:2026 hgt:154cm cid:102 iyr:2012 pid:6632346648 ecl:amb
byr:2010 hcl:z

cid:302 iyr:2014
pid:161cm eyr:2037 byr:2026 ecl:gry hgt:60 hcl:9fb9e0

ecl:brn iyr:2015 pid:041582949 cid:180 byr:1938
hgt:158cm
hcl:#602927 eyr:2026

ecl:xry pid:#546891 hcl:#18171d hgt:71cm byr:1974
iyr:2018 eyr:2026

iyr:2015 eyr:2025 ecl:brn hgt:180cm hcl:#b6652a
byr:1938
pid:752379523

iyr:2020 ecl:grn hgt:179cm byr:1929
cid:103 hcl:#602927
pid:212212232

pid:262917603 ecl:gry iyr:2012 hcl:#fffffd hgt:165cm eyr:2022 byr:1965

byr:1960
eyr:2031 hgt:184in
pid:#ac1606 iyr:2013 hcl:#888785
cid:260 ecl:#7b2c3b

byr:1987
eyr:2025 cid:102
hgt:74in ecl:brn hcl:#4a6c75 pid:20220733 iyr:2028

eyr:2031 pid:823539963
iyr:1957
hgt:159cm byr:1953 ecl:oth cid:186 hcl:26d85f

ecl:gry iyr:2011
hgt:167cm hcl:#fffffd pid:001642707 eyr:2030 byr:1952

iyr:2029 ecl:grt
hcl:z byr:2011 hgt:64cm pid:37027672
eyr:1923

pid:021102096
eyr:2024 hgt:66 hcl:#a97842 byr:1922 ecl:gry iyr:2013

pid:166477382 ecl:oth byr:1982 iyr:2010 eyr:2020
hcl:#866857 hgt:60in

hcl:#7d3b0c
iyr:2018 pid:065652921 byr:1939
ecl:blu
hgt:180cm eyr:2028

ecl:amb iyr:2020 byr:1967 hcl:#fffffd eyr:2028 hgt:157cm

eyr:2029 hgt:185cm cid:85 hcl:z iyr:2014 pid:#1f4787 ecl:grn byr:2010

byr:1987 hcl:d397d9 iyr:2028
hgt:158cm pid:686994921 ecl:hzl

ecl:oth
byr:2008
pid:#db73d9 hgt:174cm hcl:#6b5442 iyr:1955 eyr:2028

eyr:2020 ecl:amb pid:490866828 hcl:#cfa07d cid:113
hgt:165cm

iyr:2011
pid:320518492
eyr:2028 byr:1940 hgt:164cm cid:84
hcl:#341e13 ecl:grn

hgt:142
hcl:z pid:152cm iyr:1953 eyr:2040 ecl:#e44f11 byr:2024

ecl:gmt hcl:be7483 eyr:2027
iyr:2026
pid:396722617 hgt:153cm

ecl:dne byr:2015
pid:330208482
hcl:#7d3b0c iyr:2014 eyr:2022 hgt:95

byr:1925 hcl:#7d3b0c
ecl:gry
eyr:2024
pid:694714722 hgt:158cm iyr:2015 cid:283

eyr:2023
hgt:183cm cid:345
hcl:#6b5442 ecl:hzl iyr:2019 byr:1971 pid:458416257

ecl:#dcae8b
iyr:2027 eyr:1940 byr:2009 hcl:f024de pid:20713584
hgt:169in

hcl:#888785 eyr:2026
byr:1984 iyr:2013 pid:935837461
hgt:193cm
ecl:gry

pid:7343429 byr:2002
hgt:191cm
ecl:lzr iyr:1983
eyr:1966 hcl:#623a2f
cid:302

hcl:#888785 iyr:2014 hgt:173cm
byr:2002 pid:005350165 eyr:2022

byr:2013 iyr:2028
ecl:lzr pid:5426915565 eyr:2018 hcl:z hgt:70cm cid:142

eyr:2021 hgt:157cm ecl:utc iyr:2014
byr:1934 cid:348 hcl:#623a2f pid:607329117

iyr:2015 hgt:167cm ecl:hzl
pid:088516395 hcl:#efcc98 byr:1968 eyr:2029

eyr:2028
iyr:2019
cid:199
ecl:amb
hgt:152cm byr:1928 pid:547112666 hcl:#623a2f

pid:406202463
byr:1950 cid:214
eyr:2021 hcl:#fffffd hgt:177cm
ecl:brn

eyr:2029
cid:210 byr:1982 pid:578085789 ecl:brn
hgt:187cm iyr:2010 hcl:#c0946f

byr:1980 hcl:#c0946f hgt:159cm pid:177650318 eyr:2024 ecl:amb iyr:2019

pid:923359071 byr:1997 ecl:#faa530
eyr:2028 iyr:2013 hcl:e6c902 hgt:177cm

eyr:2040
cid:98 hgt:156in
ecl:oth
iyr:1996 pid:81500971
hcl:#6b5442
byr:2017

byr:2004 iyr:1941
hcl:e1e4bb hgt:67cm pid:1143915351 ecl:#0d3e5d eyr:1972

hgt:184cm hcl:#623a2f
eyr:2028 pid:680951513 ecl:grn iyr:2014 byr:2001

hcl:#866857 hgt:156cm
eyr:2020
ecl:grn iyr:2010 pid:589945116

pid:599795227 iyr:2016 ecl:grn
hcl:#cfa07d hgt:157cm byr:1967 eyr:2029

hcl:#b6652a
byr:1966 iyr:2017 pid:117232314 ecl:oth hgt:186cm eyr:2029

pid:605019880
iyr:2020
hgt:169cm byr:1980 hcl:#623a2f
ecl:hzl eyr:2030

eyr:2019 hcl:#ceb3a1 pid:988269284
iyr:2015 byr:1989 hgt:171cm ecl:oth

cid:311 byr:1998 ecl:hzl
eyr:2027 hgt:152cm pid:734870801 hcl:#7d3b0c
iyr:2013

hcl:#efcc98
hgt:180cm iyr:2020
pid:202682423 byr:2027 ecl:grn eyr:2030

hcl:f0701f pid:161cm cid:291 hgt:160in iyr:2030
ecl:#e12345

cid:248 byr:1943 eyr:2024 hgt:181cm ecl:brn iyr:2010 hcl:#bf813e

byr:2005 hgt:187in eyr:2034 iyr:2025 hcl:z ecl:gmt
pid:78691465

byr:2000
hcl:#574f4e eyr:2024 iyr:2017 pid:#fec795 hgt:185cm ecl:gry

hcl:#a97842 byr:1959
iyr:2019 pid:690444949
hgt:160in eyr:1978

cid:236
iyr:2010 eyr:2025 byr:1976 pid:398376853
hcl:#341e13
hgt:150cm

hgt:182cm iyr:2019 hcl:#866857
ecl:grn
byr:1926 eyr:2029 pid:307880154 cid:94

ecl:blu
hgt:182cm pid:178cm byr:2019 eyr:2025
iyr:2022 hcl:#a2117d

eyr:2020 hcl:#c0946f ecl:amb pid:135511825 byr:1954 hgt:68in iyr:2017

hgt:188cm ecl:amb iyr:2011
pid:949021029 eyr:2028 hcl:#fffffd byr:1986

iyr:1949 pid:#8a8d94 ecl:#922a92 byr:1925 hcl:#63c4a5

hcl:#c0946f
ecl:grn iyr:2013 eyr:2024 pid:420295283 hgt:181cm
byr:1977

byr:1941 pid:299186098 hcl:#f1fa72
iyr:2013 ecl:amb eyr:2022 hgt:152cm
cid:150

ecl:blu eyr:2021 hgt:60in hcl:#623a2f
byr:1930 iyr:2018

eyr:2028 pid:663108638
hgt:75in cid:217
byr:1962 ecl:brn hcl:#733820

hcl:#341e13 hgt:188cm ecl:blu
pid:868930517
eyr:2029
iyr:2010 byr:1938

pid:194376910 byr:1956
hcl:#cd4ab4
eyr:1940 iyr:2012 ecl:#396cc3

pid:#c5da2a hgt:162cm
hcl:#866857
cid:95 ecl:#fa1f85
iyr:1965 byr:1963 eyr:2039

pid:44063430 hcl:289b20
ecl:#77ddd9 eyr:1953
iyr:1924 byr:2026 cid:267 hgt:180in

ecl:brn pid:990171473
eyr:2028 byr:1937
hgt:165cm iyr:2015
hcl:#fffffd cid:68

iyr:1968 ecl:lzr pid:#05a4ab eyr:1944 hcl:z

hgt:185cm hcl:#7d3b0c eyr:2029 ecl:oth
iyr:2016 byr:1997 pid:349316183

hcl:z
ecl:gry
hgt:192in pid:542996841 iyr:2019 cid:144 eyr:2028
byr:2026

eyr:2024
hcl:#18171d
ecl:grn hgt:160cm pid:399767457 byr:1979 iyr:2015

ecl:#924147 pid:665314 cid:216 iyr:2026 hcl:z
byr:2023 hgt:157
eyr:1987

eyr:1989 hcl:4f8779 ecl:#05ff52 iyr:1943 pid:3693010880 hgt:72cm
byr:2009

hcl:#c0946f eyr:2022
iyr:2015 hgt:157cm byr:1928 ecl:grn pid:243566446

eyr:2030
hcl:#733820 byr:1988 iyr:2017 cid:125 hgt:193cm ecl:amb pid:939550667

cid:161 hgt:157in
hcl:#cfa07d eyr:2036 ecl:#4efa35
iyr:2012 pid:3943280550 byr:1979

ecl:lzr hcl:#341e13 hgt:69cm eyr:2026 cid:322 byr:2006 pid:827964469

ecl:amb iyr:2012
eyr:2020 hgt:178cm pid:590705772 cid:218
hcl:#c0946f byr:1922

hcl:632b01 cid:252 byr:1933 ecl:hzl
iyr:2025 eyr:2040 hgt:191cm
pid:406010613

pid:711656819 ecl:blu eyr:2030 hgt:151cm
byr:1999 cid:319
hcl:#efcc98

pid:294223216 iyr:2012
hgt:171cm
eyr:2027
hcl:#ceb3a1 ecl:oth
byr:1952 cid:58

hcl:#888785 pid:457433756 eyr:2022 hgt:186cm
cid:336
byr:1923 iyr:2013 ecl:oth

byr:2014 hcl:6ce7d6 eyr:2030 pid:190cm iyr:2018 hgt:63cm ecl:#5063b9

cid:267 hgt:189cm
eyr:2020 hcl:#ffeffd iyr:2014 byr:1989
ecl:grn
pid:571696542

iyr:1953 hgt:160in
ecl:grt cid:188 eyr:2034
pid:179cm byr:2007
hcl:6895eb

hgt:165cm ecl:oth
iyr:2020
eyr:2028
hcl:#18171d pid:111506895

eyr:1957 cid:133 ecl:hzl pid:#e56ca2 byr:2003 hcl:8a9d65

hcl:6c4ecd byr:1930 hgt:179cm
eyr:2007 iyr:2028 ecl:#3d8705
pid:#dbfeec

eyr:2036
byr:1991 ecl:#2202d0 hcl:#341e13 pid:85636989 hgt:61cm
iyr:1930

byr:1996 iyr:2027 hcl:z
pid:780164868 ecl:zzz eyr:2026 hgt:73cm

byr:1940
iyr:1992 pid:132016954 eyr:2021
cid:147 hcl:#d78bfd ecl:xry

hgt:174cm
byr:1970
eyr:2021 hcl:#341e13 pid:086579106 iyr:2017 ecl:oth

ecl:oth cid:207 byr:1998 pid:479696359
hgt:174cm iyr:2017 eyr:2020 hcl:#6b5442

ecl:hzl iyr:2014
hcl:#cfa07d hgt:163cm eyr:2025
byr:1951 pid:563337128

ecl:gry hgt:172cm iyr:2013 hcl:#efcc98
byr:1970
pid:848996674
eyr:2027

hgt:163cm pid:583600660 iyr:2015 hcl:#18171d byr:1959 ecl:brn

hcl:#efcc98 pid:353178375 cid:145
iyr:2018 byr:1988 ecl:oth eyr:2029

hgt:62in
byr:1921 pid:125944934 hcl:#b6652a
eyr:2025 cid:71 iyr:2018 ecl:blu

iyr:2017 ecl:brn hcl:#602927 hgt:172cm pid:932690969 byr:1957 eyr:2026

hcl:#efcc98 pid:709772213 cid:146 ecl:oth byr:1998 iyr:2010 hgt:74in
eyr:2029

byr:1965
iyr:2011 hcl:#6b5442 cid:325 hgt:68in eyr:2028 pid:813272708 ecl:hzl

pid:57223084 hcl:#602927 ecl:grn
hgt:156cm eyr:1972 iyr:2017

pid:21573000 byr:2030 cid:168
hcl:baee61 eyr:2021 hgt:150cm
iyr:1950 ecl:#acdd7e

ecl:gry hgt:150cm hcl:#6b5442
byr:1927
iyr:2018 pid:161cm eyr:2021

hgt:153cm
iyr:2030 ecl:grn pid:575037626 byr:1921 eyr:2021 hcl:#866857

hgt:175cm iyr:2014
byr:1946 eyr:2025
cid:159 hcl:#18171d
ecl:oth pid:129913905

pid:566885568
hgt:157cm eyr:2021 ecl:gry byr:1933
hcl:#623a2f cid:223

ecl:blu byr:1981 cid:160
iyr:2014
hcl:#a97842 eyr:2021 hgt:172cm pid:714902414

hcl:#b6652a eyr:2021
hgt:168cm byr:1921 iyr:2018 ecl:oth pid:021318713

hgt:168 pid:222439573
cid:209
hcl:z byr:2016 ecl:#26a0fb
eyr:2031

hgt:181cm
byr:1970 eyr:2024
pid:476171876 ecl:hzl
hcl:#efcc98
iyr:2019

hcl:#18171d ecl:oth iyr:2018 byr:1949 hgt:165cm
eyr:2029 pid:078204562

byr:2021 ecl:blu iyr:1963
pid:2911597977 hcl:#ceb3a1 eyr:2020
hgt:154cm

pid:159642237
hcl:#81e94d ecl:gry eyr:2028 byr:1958

hgt:90 hcl:#a97842 pid:#db1158
iyr:1928 ecl:#c82a43 byr:1971 eyr:2036

eyr:2020
hgt:177cm iyr:2013
cid:347 ecl:grn
byr:1998 pid:455369144

byr:1936
pid:444305229 iyr:2013 eyr:2025 hcl:#733820
ecl:gry
hgt:175cm

byr:2027 hcl:z
hgt:61cm ecl:brn pid:836686228 eyr:2023 iyr:2030

byr:1931
ecl:hzl hgt:168cm eyr:2023 pid:956562488 hcl:#fffffd

ecl:#4126e5 pid:182cm iyr:2021
hgt:144 eyr:2039 hcl:z

pid:321400085 hcl:#733820 hgt:189cm
ecl:hzl byr:1923 eyr:2023 iyr:2016

iyr:2011 hgt:192cm hcl:#b6652a byr:1988 pid:998875769
ecl:#e612d9 eyr:2015

eyr:2021 iyr:2011 pid:265966660
byr:1934 hgt:180cm
hcl:#7d3b0c
ecl:gry cid:225

pid:550612542 ecl:oth byr:1931
iyr:2014 cid:99
hcl:#cfa07d hgt:163cm eyr:2026

ecl:gry hgt:156cm iyr:2018 hcl:#5d9d64 pid:295386055 byr:1996
eyr:2025

ecl:gry iyr:2013 pid:855457285 cid:309 eyr:2030
hcl:#733820 byr:1973

eyr:2030 pid:86472746 ecl:blu
hgt:192cm
iyr:2013 byr:1939 hcl:#b6652a

hcl:#888785
byr:1935
iyr:2018
hgt:155cm ecl:grn
pid:612879095 cid:108 eyr:2027

eyr:2016 hcl:z pid:025915371 iyr:2010 hgt:183cm ecl:gry
byr:2010
cid:228

hcl:#38dbf4
byr:1925 ecl:amb eyr:2020 pid:065102805 iyr:2018

cid:244 hgt:171cm
hcl:#cfa07d pid:466737179 eyr:2025
byr:1937 iyr:2020 ecl:oth

ecl:brn byr:1993 hgt:179cm hcl:#341e13 pid:855375268 eyr:2028
iyr:2018

pid:809135189 iyr:2020 hgt:162cm eyr:2027
hcl:#888785 byr:1988 ecl:grn

byr:2003 pid:4446708453
hgt:188cm iyr:2013 hcl:#888785 ecl:blu eyr:2008

hgt:165in ecl:#db642f iyr:2014
eyr:2020
byr:1955 hcl:371f72 pid:756089060

ecl:lzr
hgt:177in eyr:2037 pid:175cm
byr:2023 hcl:03b398 iyr:2026

iyr:2017 ecl:blu byr:1942 hcl:#733820 eyr:2023 hgt:151cm pid:289923625
        """.trimIndent()
    }
}

/**
 * DAY 5 PROBLEM 1
 */
object InputDay5Problem1 : Inputs() {
    override fun getInput(): String {
        return """
FBBFBFBLRR
FBFFFFFLLR
FBBBBBBLLR
FFBFBBBRLL
FBBFFFFLRR
BFFBFFFLLL
FFBFFFFRLR
FBBBBFBRLR
BFBFFBBRRL
FFFBBBBLLL
BFBBFBBLLL
FBFFFFBRLL
BBFBFFBRRR
BFBBBFFRLR
FBFFFBFRLL
BBBFFFFLLL
FBBFBFBRRR
FFBBBFFRRR
BBFBBBFLLL
BBFFBFBLRL
FBFBBFFLLR
BFFBBBFLRL
FFFBBBFLRL
FBFBFBFRLR
FBFBFFBLLR
BFFFFFBRLL
FFFBBBFLRR
FFBBFBFLLR
FFBBBBFRRL
BFFBFFBRLR
FBBBBFFLRL
BBFFBFFLRR
FFFFBBFRLR
BFBFBBFLRL
BFFFBBFLLR
BFBFFBBLLL
FFBFFFBRRR
BBFFFBBLLL
FFBFBFFRLR
FFFBBFFRRL
FBBFBBFLRR
BBFFBFBRRL
FFBFFBBRRR
BBFFBFBRRR
BFFFBFBLRL
FFFBBFBRLL
BFBBFBFLRL
FFFFFBBRRR
FBBBBBBRRR
FBFBFFFLRR
FBBFFFBLLL
BFBBFFBRLL
BFBFFBBLLR
FFBBFFFLLL
FBBBFBFRLL
FFFFBFFLRL
FFBFBFFLRL
BFBBBFBRLR
BBFBFFBRRL
BFBBBFBLRR
FBBBBFBRRL
BFFFBBBLRL
BFBFFBFLRL
FFFFFBBRLL
BFFBBFBLLL
BBFBBBFRRL
BBBFFFFRRR
FBFBBFFRLL
BFBFBFFRLR
BBBFBBFRRL
BFBFBBFRLR
FFBBFBBRRL
FBFFFFBLRL
BFFBBBFRLR
BFBFFFFRRR
BFBFFFBRRR
FBFBBFFRLR
FBFBBFBLLL
BBBFFBFRLL
BFFBBBBLLL
BBFFFFBRLR
FBBBBBBLRL
BFFFFBFRRL
FFFBBFBLLR
FBFFBBBRRR
BBFFFFBRRR
FBFFFBBLLL
FFBFBFFRLL
FBFFFFBLLL
FFBFFFBLLR
FBFBBFBLRR
FBFBFFBLLL
BFBFBBFLRR
FFBFBFFLLR
FBBFFFFLRL
FFBBFFBRLR
FFBFBBFRRR
BFBFFBFRRR
FFFFBFBLLL
FFBBFFBLLR
BBFFBBFLLL
FFFBFFBRRR
BBFBFFFLRL
BFBFBFBLRR
FFBBFFFRLL
FFBFBBBRLR
BBFBFFFLLL
FBFFBFBRLL
FFBFBFBLLL
BBFFBFFRLR
FBBFFFBLRL
BFBFBFBRLL
BFFBBFFRRR
BBBFBBFLLR
BBFBBFBLRL
BBBFBBBRLR
BBBFBFBRLL
BBFFBBFLLR
FFBBBBFLLL
BBBFFFFRLL
BBFBFBFLLL
FFBBFBBRRR
FFBFBBBRRL
FFBFBBFLRR
FBBFFBBLRL
FFFBFFBRLR
BBBFFBBRLR
FBFBBBBRLL
FFBFFBFLLR
BFFFFBFRRR
FFBBFFBRRL
BBBFFBBRLL
BBBFFBFLLL
BBFBFFFRLR
FFBFFFFLRL
FBFFBFBRRR
BFBFFBBLRL
FBBBBBFLLL
BFBFFBBRLR
BFBFBFBLLR
BBBFFFBLLR
BFBBFBFRLL
FFBFFBFRLR
BFBFBBFLLR
BBFFBBFRRL
FBFBFFFLLR
BBFBBFBRRL
BFBFFBFRRL
BFBBFFFLLL
BBBFFBFRRL
BBBFBBFLRR
BFBBFFFLRR
FBBFBBFLLL
BFBFFFFRLR
FFBBFFFRRR
BBBFBBFRLL
BBBFFFFLRL
BBBBFFFLRR
BFFBFFFRRR
FFBBBBBLRR
FBBFBFBRRL
FFBBBFBLLR
BBFFFFFLLR
FBFFBFFLRR
FBBFBBFLLR
BFBFBFBRRL
BFFFFFBLRR
FFFBBBFRRR
BBFFFFFLRL
BFBFBFBLLL
FFBFBBFLRL
FFBFFBFRRR
FBBBFBBRRR
FFBFBFBRLR
BFFBFBBRRR
BFFFBFFRRR
FFFBFBBLRL
BBBFBFFRRL
BBFBFBBLLR
FBFFBBBLRL
BFBFBBBLRR
FBFBFBBRRL
BFFFFBFRLL
FBBBBFFRLL
BBFFFBFLRR
FBBBFFFLLL
FFFFFBBLRR
BBBFBBBLRL
BBFBFBBRRR
FBFBFFBRLR
FFFBBFFLRL
FBBFBBBRLL
FFBFFFBRLL
BFBBBFBLLR
FBFFFFFLLL
FFBFFBBLRR
FBFBBFBRRR
BBFBBFFRRL
FBBFFBBLRR
BFFBFBFRLL
BFFFFBFLRR
FFFBFBFRRR
BBFFBBBRLL
BFBBFFBLRL
FFBBBBBLLL
FBBFBBFRRL
BFBBFBBRRL
FFFBFFFLRL
FFBFBBBLRL
FBBBFBFRRR
BFFFBFFLRL
BFBBBFFRRL
FBFFFBFLRL
FBBBFFBRRL
FBFBFBFRLL
FBFBBBFRLL
BFFFFFFLRR
FFBBFFBLLL
BFFFFBBRLL
FFBFFBBLLL
FBFBFBFLRL
FBBBFBFLLL
BFBBFFFRLR
BFBBFFFLLR
BFBBBBFLLL
FBBBFFFRLR
FBFFBBBLLL
BBBFFBFLLR
FBFBBBBLRR
FFFFBFFLRR
FBFFFBFRRL
BFFFBFBLLL
BBFFFFFRLL
FFBFFFFLRR
FFFBBFFRLR
FBFBBBFLLR
BFBFBFFLLR
FBBFBFBLLR
FBFFFBFRLR
FBBBFFFRLL
BFFFFBFLLL
FFFBBBBRRR
BFFFFFBRLR
FFFFBBBLRL
FBFBBBFRRR
BFFFBFBRRL
FBBFFBBRLR
BFFBBBBRLL
FBFFBBFLLL
FBFBFFFRRR
FFBFFBFLRR
FBBFBFFRLR
FBFBBFBLRL
FFFBFBFLLL
FFFFBFFRRL
BFBBFFFRLL
BFFBBBBLRR
BBFBFFBRLL
BBFFFFBLRR
BBBFFFFRLR
BFFBBFBRLR
BBFFBFFLLR
FFFFBBFLRL
FBBFBBFRLR
BBFBBFFRLL
BBFFFBBRLL
BFFBBBFRLL
BBFBBFBLLR
BBBFFBBRRL
FFBFFBFRLL
BFBBFBFRRL
BFBFBBBRRR
FBBBFFBRLL
BBBFFBFLRR
FBBFFBBRRL
FFBBFFFLRL
BFFFBFFLRR
FFFFBBBRRR
FBBBFBBLLR
BFBBFBBLRL
FBFFBFBLRL
FFBFBFFLRR
BFFBFBFLRR
BBFBFFFRLL
FBBFFFBRRL
BBBFBFFLRR
BBFBBBBRLL
BBFFBBFRLR
BFBBBBBLRL
BFBFBFBRRR
BFBBFBFLLL
BFFBBBBLRL
FBFFBFBRRL
BBFBFBFLRR
FBBFFFFRRL
BBFFFFBRRL
FFFBFBFRLL
FBFBBFBRLL
FBFBBFFLRR
FFFFBFBRLL
FFFFBBFLLR
FFFFBBBLLR
FBFBBBFRRL
FFFFBBBLLL
BBBFBFFRLL
FBBBBBFRRR
BBFBFFBLRR
BBFFBBFRLL
BFFFBBFRLL
BBBFBBFLLL
BFFBFFBLRL
BBFFFBBRRL
FBFBFBFRRR
BBFFBFFLRL
BBFBBBBRRL
BFFBFFFLLR
FBFBBBBRLR
FBBFBFFRRR
FFBFFBFLRL
BFFFFBFLLR
BFFFBBFRRR
BFFFFBBLLL
FFFBBBFLLR
FBFFFFFRLR
FBFBFFFRRL
FBFBBBBLLL
BBFFFBFRLL
BBFBFBFLRL
FBBFFBFRLL
FFFBFBFLRR
FFBBFFFLRR
BFBFBFBRLR
FFBFFFBRRL
FBBFFBBRRR
BBBFFBFRLR
BFBBFFBLLR
BBBFBFBLRL
FBFBBBBLRL
FBFFFFFRRR
BBFFBBBLRL
BBFFFBBRRR
BFBBBBBLRR
FFBBFBBRLL
BFBBBBFRLR
FFFFBBBRLL
FFBFBBFRLR
FBFBBBBLLR
FFBFBBFRRL
FBBBFFBRLR
FFBFFFFLLR
BFFBBFFLLL
BBFFFBBLLR
BFFFFFFLLR
BBFBFBBLRL
BFFFFFBLLL
FFBBBBBLRL
FBFBFBFLLR
FBFFBFBLRR
BFBFBBFLLL
BFFBBFFLRR
FBFBBBFRLR
BBFFBBBRRR
FFBBBFBLLL
BFBBBFFLLR
BBFFFBFLLL
BFBFFFBLLL
BFBFFFBLRR
BBFBBBFRRR
FFBBFBBLRR
FBFBFFBRRL
BFBBFFBRLR
FFFBBBBRRL
BFBFFFBRLL
FFBBFBFLRL
BFBBFBBLLR
FBBBFFFRRL
FFBBBBBRLL
FBFBFFFRLL
BBBBFFFLRL
FBBFFFBLLR
BBFFFFBRLL
BBFFBBBRLR
BFFFFBBRRR
FFBBFFFLLR
FBBBFFBLLR
BFBBFBFLLR
BBBFBFBRRL
FBBBFBBRLL
BFFBFFFLRR
BFBFFFBRLR
BFBBBFFRRR
BFBFFBBLRR
FBFBBBBRRL
FFFBFBBLRR
FFBFBBBLLR
BBFFBBFLRL
FFFBBFBLRL
FBBFBFBRLL
FBFFBFFRRL
BFFFBFBRLR
BFBFBFFRRR
FFFFBFBLRL
FBBBBBFLLR
FBBBFFFLLR
FFFBFBBRLR
BBBFBBFRRR
BBBFBFBLRR
FBBFBFFLRR
FBFFFBFRRR
BBBFFFBRRL
BBFFFBFRRL
BFBBBFBLRL
FFBBBFBRRL
FFBBBFFRRL
FBBBFBFLLR
FBBFBFBLLL
BBBFFFBLRR
BFBFFBFRLL
FBFFBBBLRR
BFFBFFBLLL
FFFBBBFRLL
BBBFFFBRLL
FBFBBBFLLL
FBFBFBBLRL
FBBFFBBLLL
FBBBBFBRLL
FBBFBFBLRL
FBFFFFBRRL
FFBFBFBRRL
FFBBBBFRRR
BFFBBBFRRL
FBBBBFBLRL
BBFBBBFLRL
BFFFFBBLRL
BFFFBBFRLR
FBBBBBBRLL
FFBFFBBRLR
FBFBFBFLRR
FFFBFBBRLL
BBFBBBBRRR
FFFBBBBLRR
BFBFBBBLRL
FBBFBBFLRL
BBFBFBFLLR
FBBBFBBRLR
FBBBBBBRLR
BFFFBFFRRL
BBBFFFBLLL
FBBFBBBRLR
BBFFBBFRRR
FFBFFFBLLL
FBFFBBFRLR
BFBBBBBRRL
BBFFFFFRRR
BFFFFFBRRR
FFBFBFBRLL
FBFFBBFLRR
FFFFFBBRRL
FBBFFFBLRR
BFFFBFFLLL
BBFBBFFLLL
BBBFBBFRLR
BFFBFBBLLL
FFBFFFFRLL
FBFFBBBRLR
BFFFBBBRLR
BBFFBBBLRR
FFFBBBBRLL
FBBFBFFLLL
BFBFBBBLLL
FBBBBBFLRL
FFBFFBBLRL
BBBFFFBRRR
FFFBFBFLLR
BFFFBBBLRR
BFFFBBBRRL
BBFFFFFLLL
FBBBBBFRRL
BFBFFBBRRR
BFFFFFFRRR
FBFFBFBRLR
BFBBBBFLLR
FFBBBFBRRR
BFBFFFFRRL
BFFBFFBRLL
FFFBFFBLRR
BFFBBFFRRL
BFFFFBFRLR
FBBBBBFRLR
BFBBBBBLLL
FFFBFBBRRR
FFFFBFBRRL
FFFBBBBRLR
FBFBFFBLRR
BFFFBBFLRL
FFBBFFFRLR
FFFBBFBLRR
FBBBBFBLLR
FFBBBFBLRR
FBFBBFFRRL
FFFFBFBLRR
BFBFFFFLLL
FBFBFBBRLL
FFFFBFFRLR
FFBBBBBLLR
BFFFBFFRLL
FFFFBFBLLR
FBFBFBFRRL
BBFBBBFLRR
BBFBBBFLLR
BBFBBFFLRL
BBBFFFFRRL
BFFFFBBRLR
BFBBFFFRRL
BFBBBFFLLL
FFFBBFFRLL
FBBBBFBLRR
BBBFFBFRRR
FBFBFFBLRL
FBBFBFFRRL
FFFBFBBRRL
BFBBFBBRLL
BFBBFBFRRR
FFFBFBBLLL
BFFBFBBLRR
BFBBBBFRLL
BFFBFBBLLR
FFFFBFFLLR
FFBBFBBLRL
BFBFFFFLLR
FBFFBBFRLL
FFFBBBFLLL
BBBFFFFLRR
BFBFBBFRRR
FFBBFBFRLL
BBFBBBBRLR
BFBFBFBLRL
BBBFFBBLRR
BBFFBFFRLL
FFBFBFFRRR
FFBBFFBRRR
BBFBFBBLRR
BFFBFFBLLR
FBFFBFFRLL
FFBFFFFLLL
FBFBFFFLRL
FBFFBBFLLR
BFFBFFBLRR
FBFFFFFRLL
BFBFBFFRLL
FFBFFFBLRR
BFBBBBFLRR
BFFBBBBRRR
FBFFBBBRLL
BBBFBBBRRL
FFFBBFFLRR
FFFFBFBRLR
BBFBBBFRLR
FBBBBFFRRL
FBFFFBFLLR
BFFBFFBRRL
BBFBFFFLRR
FFFBFFBLLR
FBBBFBBLRL
FBFBFBBLLR
BFFFBFFLLR
FFFFFBBRLR
BBFFBFFRRL
BFBFBBBRLR
FBBBFFBRRR
BBFBBFBRLR
FBFBBFFLRL
BBBBFFFLLL
BBFFBBBLLL
FBFBBFFRRR
BBFFBFFLLL
FBBBFFFLRL
BFFBFFFLRL
FBBFFFBRLR
FBBFBBBLRL
FFBFBBFLLL
FBFFBFFRRR
BFFFFFFLLL
BBFBBFBRLL
BFFFBFBRLL
FBFFBFBLLL
FFBFFBFRRL
BBFFBFBLLR
FBBBFBFRLR
BFBFBFFRRL
BFBFFFBLLR
FFBBFBBRLR
BBFBFBBRRL
FFBFBFFRRL
BFFBBFBRRR
BFFFFBBLLR
BFBFFBBRLL
BFBBFFBRRR
FBFBBFBRRL
FFFFBBFRRR
BFFFBFBLRR
FBFFFBFLLL
BBFBBBBLLL
BBFFFFBLLR
FFFBBFFRRR
FFBBBFBLRL
BFBBFFFRRR
BBFBFFBLLR
FFBBFFBLRL
FFBFFFBLRL
BBFBBFFRLR
FFBBFFFRRL
BBFFFBBLRL
FFFBFBFLRL
FFBBFBBLLR
FBFFBFFRLR
BBFBFBFRLL
FFFBFFBLLL
BFFFBBFRRL
FBFBFFFLLL
BBFFBBFLRR
BFFBBFBLRL
FFBBFBFRLR
BBBFFFBLRL
FBFBBBBRRR
BFBBBFBLLL
BFBBFFBLLL
BFFFBFFRLR
BBBFBFFRLR
FBBBFFBLLL
FFFFBFFRLL
FFFBFFBRRL
BFBFBBBRRL
FBBFBBFRLL
BBFBBBBLLR
BFFBBBFLLR
FFBFBBBRRR
FFBFFFBRLR
BFBBFFBRRL
BBBFBFFLLR
FBBBFFBLRR
FBFBBFFLLL
FBFBFFFRLR
FBBFFFFRLL
FFBBFBFRRL
BBFBBBBLRL
FBBBBBBLLL
FFFBFFFRLR
FBBFFFFLLL
FFFBBFBRRR
BBFFBFBLRR
FFBFFBBLLR
FBBBFFBLRL
BBFBBBBLRR
FFBFBFFLLL
FBBBBFBRRR
FFBBBFFLLR
FBFFFBFLRR
BFFBFBBRLR
FBFBFFBRRR
BBFFBBBLLR
BFBFBBFRRL
FBFFFFBLLR
FFBBFBFRRR
BFBFFFFRLL
FFFFBBFRLL
FBBFBBBLRR
FBBBBFFLLL
FBBFFFBRRR
FBBBFBFLRR
BFFBFBBRLL
FBFFFFBRRR
BFBBBBBRLR
BBBFFBBLLR
BFFBFFFRLL
BBFBFFBRLR
BFFFBFBRRR
FBBFFBFLRR
BFFFFFFRLR
FBBFFBFLLL
BBBFBFFRRR
FBBFFBBLLR
FBBFFFFRLR
FFFBFFFRRR
BFFFFFFRRL
FFFBFFFLRR
BFFFFFBRRL
BFFFBBBRLL
BFBBBBFRRL
BBBFBBFLRL
BBBFFBBLRL
FBFBFBBLRR
BBFFFBFLRL
BFBFFFFLRR
FBFBBFBLLR
BBFBFBFRRL
FFBBBFBRLR
FFBBFBFLLL
FBBFBFBRLR
FBFBBBFLRR
BFBFBBBLLR
FFBBBBFRLL
FFFBBBBLRL
BFBFBBBRLL
BFBBFBBRRR
BFBBBBBRRR
FFBFBBFLLR
FBBBFBFLRL
BBFFFBFRLR
FBBBFBBLRR
BBFFFFFRLR
BFBFFFFLRL
BFBFFBFRLR
FBBBBBFRLL
FFFBFBFRLR
BFBFBFFLRL
FBFFBFBLLR
BFFBBBBRLR
FBFFFBBLLR
FBBFBFFLLR
FBBFFFFLLR
BFBBBFBRRR
FFBBBFFLLL
FFBBFFBRLL
FBBFBBBRRL
BBFBFFFRRL
FFBBBBFLLR
FBBFFFBRLL
FFFBBBBLLR
FBFFFFFLRL
FFFFBFBRRR
FBFBFBBRLR
BFFBBFBLRR
FFFFBFFRRR
BBFBBFFRRR
BBFBFBFRRR
FBFFFFFRRL
BFFFFBFLRL
BFFFFFFRLL
BFBFFBFLRR
BBFFBFBRLR
FFFBBBFRLR
FFBBFBBLLL
FBBBBFBLLL
FFBBBFFLRR
FFBFFBBRLL
BFFBBFBRRL
FFBFBFBLRR
FFBFBBFRLL
FBBFBBBLLL
FBFBBFBRLR
BBFFFBBLRR
FFFBFFFRRL
FFBBBFBRLL
FBBBFBFRRL
FBFFFBBRLR
FFFBFFFLLL
BFBBFBBLRR
BFFBFBFRRL
FFBBBBFLRL
BBBFFBFLRL
FBFFBBFLRL
FBBBFFFLRR
BBFFBBBRRL
FFBBFBFLRR
BFFBBBBRRL
BBFFBFBRLL
BBFFFFFRRL
FBFFFBBRRR
FFFBFBBLLR
FFBFBFBLRL
FBFFBFFLLR
FFFFBBBRRL
BFBBBFFLRL
BBBFBBBLLL
BBFBFFFLLR
FFBBBFFRLR
BFFBFBFRRR
FBBBBBBRRL
BBBFBBBRRR
FBFFFBBRLL
BBFBFFBLRL
BFFFFFFLRL
BFBFBFFLLL
FFBBBBFRLR
BFFBFBFLRL
FBBFBFFLRL
BFBBFFFLRL
FFFBFFBRLL
BFBBBFBRRL
FFBFBFBLLR
BFFBFBBRRL
FBBBBFFLRR
BFFFBBBLLR
FBFFFBBRRL
FBBFBFFRLL
BBFBBFBRRR
BFFFFBBLRR
FFFFBBBRLR
FBBFFBFRLR
BFFFBBFLRR
BFFBBFFRLR
BFFBFBBLRL
FBFFBBBLLR
BFBBBFFLRR
BFFFFFBLRL
BBBFBFBRLR
BFBFFFBLRL
BBFBBFFLLR
FFBBFFBLRR
BBFBBFBLRR
BFFFFFBLLR
BFFBBFFLRL
BFFBBBBLLR
FBBBFFFRRR
BBBFFFFLLR
BFFBBFFRLL
FBBBBFFRRR
FFBFBBBLRR
FBBBFBBRRL
BFFFBBFLLL
FBFFFBBLRR
FBBFFFFRRR
BBFBFBFRLR
FBFFFFBRLR
FFBBBFFLRL
FFFFBBBLRR
BFFBBFBRLL
FBBFBBFRRR
BBBFBFBLLL
FBFBFFBRLL
BBBBFFFLLR
BFFBBBFLLL
FBBFBBBRRR
BBFFFFFLRR
BFFBFBFLLR
BBBFFBBLLL
BBBFBBBLLR
BBFFFFBLRL
FBBBBFFLLR
FFFBBFBLLL
FBBFFBFRRR
FBBBBFFRLR
FBFBFBFLLL
BBBFBBBLRR
FFFBFBFRRL
BFFFBBBRRR
BBBFBFBLLR
FBFBFBBLLL
BBFBFFBLLL
FFBFBFBRRR
BBFBFBBRLL
FBFFFFBLRR
BBFFFBBRLR
FBBFFBFLLR
BBFBBBFRLL
FFFBBFFLLR
FBBFFBFLRL
BBFFFBFRRR
FBBBBBBLRR
BBBFBBBRLL
BBFBFFFRRR
BFFFFBBRRL
FFFBBFBRLR
BFFBFFBRRR
BFBBFBFLRR
FFBBBBBRRR
BFFFBFBLLR
BFFBFFFRLR
BFFBFBFRLR
FFFBBBFRRL
FFFBFFBLRL
FFFFBBFLLL
BFBBFBBRLR
FFBBBBFLRR
BBFBFBBLLL
BFBBBBBRLL
BFBBBFFRLL
FBBBBBFLRR
FBFFBBFRRR
FBFFBBBRRL
BFBBBBFLRL
BFFBBFBLLR
FBFFFBBLRL
FBBFBBBLLR
BFBBFFBLRR
FBBFFBFRRL
FFBBBBBRLR
FFBFFBBRRL
FBBFFBBRLL
FFFFBBFRRL
BBFFFBFLLR
BBFBBFFLRR
BFBBBBBLLR
FBFFFFFLRR
FFBFFBFLLL
BFBFFBFLLL
BBBFFBBRRR
FBFBBBFLRL
FBFBFBBRRR
BBBFFFBRLR
BBBFBFBRRR
FFFFBFFLLL
BFBFFBFLLR
BFBFFFBRRL
FFBFBBBLLL
BFFFBBBLLL
BFBBBBFRRR
BBFBBFBLLL
FFBBBBBRRL
BBBFBFFLLL
BFFBFFFRRL
FFFBFFFRLL
BFBFBBFRLL
BFBBFBFRLR
FFFBBFFLLL
FFBBBFFRLL
FFBFFFFRRL
BFBFBFFLRR
BBFBFBBRLR
BBFFFFBLLL
BFFBBFFLLR
FFFBBFBRRL
BFFBBBFRRR
BFFBBBFLRR
BFBBBFBRLL
FBFFBBFRRL
BBFFBFFRRR
BBFFBFBLLL
FFFBFFFLLR
FBFFBFFLRL
FBFFBFFLLL
FFFFBBFLRR
BBBFBFFLRL
FBBBFBBLLL
FFBFFFFRRR
        """.trimIndent()
    }
}

/**
 * DAY 5 PROBLEM 2
 */
object InputDay5Problem2 : Inputs() {
    override fun getInput(): String {
        return """
FBBFBFBLRR
FBFFFFFLLR
FBBBBBBLLR
FFBFBBBRLL
FBBFFFFLRR
BFFBFFFLLL
FFBFFFFRLR
FBBBBFBRLR
BFBFFBBRRL
FFFBBBBLLL
BFBBFBBLLL
FBFFFFBRLL
BBFBFFBRRR
BFBBBFFRLR
FBFFFBFRLL
BBBFFFFLLL
FBBFBFBRRR
FFBBBFFRRR
BBFBBBFLLL
BBFFBFBLRL
FBFBBFFLLR
BFFBBBFLRL
FFFBBBFLRL
FBFBFBFRLR
FBFBFFBLLR
BFFFFFBRLL
FFFBBBFLRR
FFBBFBFLLR
FFBBBBFRRL
BFFBFFBRLR
FBBBBFFLRL
BBFFBFFLRR
FFFFBBFRLR
BFBFBBFLRL
BFFFBBFLLR
BFBFFBBLLL
FFBFFFBRRR
BBFFFBBLLL
FFBFBFFRLR
FFFBBFFRRL
FBBFBBFLRR
BBFFBFBRRL
FFBFFBBRRR
BBFFBFBRRR
BFFFBFBLRL
FFFBBFBRLL
BFBBFBFLRL
FFFFFBBRRR
FBBBBBBRRR
FBFBFFFLRR
FBBFFFBLLL
BFBBFFBRLL
BFBFFBBLLR
FFBBFFFLLL
FBBBFBFRLL
FFFFBFFLRL
FFBFBFFLRL
BFBBBFBRLR
BBFBFFBRRL
BFBBBFBLRR
FBBBBFBRRL
BFFFBBBLRL
BFBFFBFLRL
FFFFFBBRLL
BFFBBFBLLL
BBFBBBFRRL
BBBFFFFRRR
FBFBBFFRLL
BFBFBFFRLR
BBBFBBFRRL
BFBFBBFRLR
FFBBFBBRRL
FBFFFFBLRL
BFFBBBFRLR
BFBFFFFRRR
BFBFFFBRRR
FBFBBFFRLR
FBFBBFBLLL
BBBFFBFRLL
BFFBBBBLLL
BBFFFFBRLR
FBBBBBBLRL
BFFFFBFRRL
FFFBBFBLLR
FBFFBBBRRR
BBFFFFBRRR
FBFFFBBLLL
FFBFBFFRLL
FBFFFFBLLL
FFBFFFBLLR
FBFBBFBLRR
FBFBFFBLLL
BFBFBBFLRR
FFBFBFFLLR
FBBFFFFLRL
FFBBFFBRLR
FFBFBBFRRR
BFBFFBFRRR
FFFFBFBLLL
FFBBFFBLLR
BBFFBBFLLL
FFFBFFBRRR
BBFBFFFLRL
BFBFBFBLRR
FFBBFFFRLL
FFBFBBBRLR
BBFBFFFLLL
FBFFBFBRLL
FFBFBFBLLL
BBFFBFFRLR
FBBFFFBLRL
BFBFBFBRLL
BFFBBFFRRR
BBBFBBFLLR
BBFBBFBLRL
BBBFBBBRLR
BBBFBFBRLL
BBFFBBFLLR
FFBBBBFLLL
BBBFFFFRLL
BBFBFBFLLL
FFBBFBBRRR
FFBFBBBRRL
FFBFBBFLRR
FBBFFBBLRL
FFFBFFBRLR
BBBFFBBRLR
FBFBBBBRLL
FFBFFBFLLR
BFFFFBFRRR
FFBBFFBRRL
BBBFFBBRLL
BBBFFBFLLL
BBFBFFFRLR
FFBFFFFLRL
FBFFBFBRRR
BFBFFBBLRL
FBBBBBFLLL
BFBFFBBRLR
BFBFBFBLLR
BBBFFFBLLR
BFBBFBFRLL
FFBFFBFRLR
BFBFBBFLLR
BBFFBBFRRL
FBFBFFFLLR
BBFBBFBRRL
BFBFFBFRRL
BFBBFFFLLL
BBBFFBFRRL
BBBFBBFLRR
BFBBFFFLRR
FBBFBBFLLL
BFBFFFFRLR
FFBBFFFRRR
BBBFBBFRLL
BBBFFFFLRL
BBBBFFFLRR
BFFBFFFRRR
FFBBBBBLRR
FBBFBFBRRL
FFBBBFBLLR
BBFFFFFLLR
FBFFBFFLRR
FBBFBBFLLR
BFBFBFBRRL
BFFFFFBLRR
FFFBBBFRRR
BBFFFFFLRL
BFBFBFBLLL
FFBFBBFLRL
FFBFFBFRRR
FBBBFBBRRR
FFBFBFBRLR
BFFBFBBRRR
BFFFBFFRRR
FFFBFBBLRL
BBBFBFFRRL
BBFBFBBLLR
FBFFBBBLRL
BFBFBBBLRR
FBFBFBBRRL
BFFFFBFRLL
FBBBBFFRLL
BBFFFBFLRR
FBBBFFFLLL
FFFFFBBLRR
BBBFBBBLRL
BBFBFBBRRR
FBFBFFBRLR
FFFBBFFLRL
FBBFBBBRLL
FFBFFFBRLL
BFBBBFBLLR
FBFFFFFLLL
FFBFFBBLRR
FBFBBFBRRR
BBFBBFFRRL
FBBFFBBLRR
BFFBFBFRLL
BFFFFBFLRR
FFFBFBFRRR
BBFFBBBRLL
BFBBFFBLRL
FFBBBBBLLL
FBBFBBFRRL
BFBBFBBRRL
FFFBFFFLRL
FFBFBBBLRL
FBBBFBFRRR
BFFFBFFLRL
BFBBBFFRRL
FBFFFBFLRL
FBBBFFBRRL
FBFBFBFRLL
FBFBBBFRLL
BFFFFFFLRR
FFBBFFBLLL
BFFFFBBRLL
FFBFFBBLLL
FBFBFBFLRL
FBBBFBFLLL
BFBBFFFRLR
BFBBFFFLLR
BFBBBBFLLL
FBBBFFFRLR
FBFFBBBLLL
BBBFFBFLLR
FBFBBBBLRR
FFFFBFFLRR
FBFFFBFRRL
BFFFBFBLLL
BBFFFFFRLL
FFBFFFFLRR
FFFBBFFRLR
FBFBBBFLLR
BFBFBFFLLR
FBBFBFBLLR
FBFFFBFRLR
FBBBFFFRLL
BFFFFBFLLL
FFFBBBBRRR
BFFFFFBRLR
FFFFBBBLRL
FBFBBBFRRR
BFFFBFBRRL
FBBFFBBRLR
BFFBBBBRLL
FBFFBBFLLL
FBFBFFFRRR
FFBFFBFLRR
FBBFBFFRLR
FBFBBFBLRL
FFFBFBFLLL
FFFFBFFRRL
BFBBFFFRLL
BFFBBBBLRR
BBFBFFBRLL
BBFFFFBLRR
BBBFFFFRLR
BFFBBFBRLR
BBFFBFFLLR
FFFFBBFLRL
FBBFBBFRLR
BBFBBFFRLL
BBFFFBBRLL
BFFBBBFRLL
BBFBBFBLLR
BBBFFBBRRL
FFBFFBFRLL
BFBBFBFRRL
BFBFBBBRRR
FBBBFFBRLL
BBBFFBFLRR
FBBFFBBRRL
FFBBFFFLRL
BFFFBFFLRR
FFFFBBBRRR
FBBBFBBLLR
BFBBFBBLRL
FBFFBFBLRL
FFBFBFFLRR
BFFBFBFLRR
BBFBFFFRLL
FBBFFFBRRL
BBBFBFFLRR
BBFBBBBRLL
BBFFBBFRLR
BFBBBBBLRL
BFBFBFBRRR
BFBBFBFLLL
BFFBBBBLRL
FBFFBFBRRL
BBFBFBFLRR
FBBFFFFRRL
BBFFFFBRRL
FFFBFBFRLL
FBFBBFBRLL
FBFBBFFLRR
FFFFBFBRLL
FFFFBBFLLR
FFFFBBBLLR
FBFBBBFRRL
FFFFBBBLLL
BBBFBFFRLL
FBBBBBFRRR
BBFBFFBLRR
BBFFBBFRLL
BFFFBBFRLL
BBBFBBFLLL
BFFBFFBLRL
BBFFFBBRRL
FBFBFBFRRR
BBFFBFFLRL
BBFBBBBRRL
BFFBFFFLLR
FBFBBBBRLR
FBBFBFFRRR
FFBFFBFLRL
BFFFFBFLLR
BFFFBBFRRR
BFFFFBBLLL
FFFBBBFLLR
FBFFFFFRLR
FBFBFFFRRL
FBFBBBBLLL
BBFFFBFRLL
BBFBFBFLRL
FBBFFBFRLL
FFFBFBFLRR
FFBBFFFLRR
BFBFBFBRLR
FFBFFFBRRL
FBBFFBBRRR
BBBFFBFRLR
BFBBFFBLLR
BBBFBFBLRL
FBFBBBBLRL
FBFFFFFRRR
BBFFBBBLRL
BBFFFBBRRR
BFBBBBBLRR
FFBBFBBRLL
BFBBBBFRLR
FFFFBBBRLL
FFBFBBFRLR
FBFBBBBLLR
FFBFBBFRRL
FBBBFFBRLR
FFBFFFFLLR
BFFBBFFLLL
BBFFFBBLLR
BFFFFFFLLR
BBFBFBBLRL
BFFFFFBLLL
FFBBBBBLRL
FBFBFBFLLR
FBFFBFBLRR
BFBFBBFLLL
BFFBBFFLRR
FBFBBBFRLR
BBFFBBBRRR
FFBBBFBLLL
BFBBBFFLLR
BBFFFBFLLL
BFBFFFBLLL
BFBFFFBLRR
BBFBBBFRRR
FFBBFBBLRR
FBFBFFBRRL
BFBBFFBRLR
FFFBBBBRRL
BFBFFFBRLL
FFBBFBFLRL
BFBBFBBLLR
FBBBFFFRRL
FFBBBBBRLL
FBFBFFFRLL
BBBBFFFLRL
FBBFFFBLLR
BBFFFFBRLL
BBFFBBBRLR
BFFFFBBRRR
FFBBFFFLLR
FBBBFFBLLR
BFBBFBFLLR
BBBFBFBRRL
FBBBFBBRLL
BFFBFFFLRR
BFBFFFBRLR
BFBBBFFRRR
BFBFFBBLRR
FBFBBBBRRL
FFFBFBBLRR
FFBFBBBLLR
BBFFBBFLRL
FFFBBFBLRL
FBBFBFBRLL
FBFFBFFRRL
BFFFBFBRLR
BFBFBFFRRR
FFFFBFBLRL
FBBBBBFLLR
FBBBFFFLLR
FFFBFBBRLR
BBBFBBFRRR
BBBFBFBLRR
FBBFBFFLRR
FBFFFBFRRR
BBBFFFBRRL
BBFFFBFRRL
BFBBBFBLRL
FFBBBFBRRL
FFBBBFFRRL
FBBBFBFLLR
FBBFBFBLLL
BBBFFFBLRR
BFBFFBFRLL
FBFFBBBLRR
BFFBFFBLLL
FFFBBBFRLL
BBBFFFBRLL
FBFBBBFLLL
FBFBFBBLRL
FBBFFBBLLL
FBBBBFBRLL
FBBFBFBLRL
FBFFFFBRRL
FFBFBFBRRL
FFBBBBFRRR
BFFBBBFRRL
FBBBBFBLRL
BBFBBBFLRL
BFFFFBBLRL
BFFFBBFRLR
FBBBBBBRLL
FFBFFBBRLR
FBFBFBFLRR
FFFBFBBRLL
BBFBBBBRRR
FFFBBBBLRR
BFBFBBBLRL
FBBFBBFLRL
BBFBFBFLLR
FBBBFBBRLR
FBBBBBBRLR
BFFFBFFRRL
BBBFFFBLLL
FBBFBBBRLR
BBFFBBFRRR
FFBFFFBLLL
FBFFBBFRLR
BFBBBBBRRL
BBFFFFFRRR
BFFFFFBRRR
FFBFBFBRLL
FBFFBBFLRR
FFFFFBBRRL
FBBFFFBLRR
BFFFBFFLLL
BBFBBFFLLL
BBBFBBFRLR
BFFBFBBLLL
FFBFFFFRLL
FBFFBBBRLR
BFFFBBBRLR
BBFFBBBLRR
FFFBBBBRLL
FBBFBFFLLL
BFBFBBBLLL
FBBBBBFLRL
FFBFFBBLRL
BBBFFFBRRR
FFFBFBFLLR
BFFFBBBLRR
BFFFBBBRRL
BBFFFFFLLL
FBBBBBFRRL
BFBFFBBRRR
BFFFFFFRRR
FBFFBFBRLR
BFBBBBFLLR
FFBBBFBRRR
BFBFFFFRRL
BFFBFFBRLL
FFFBFFBLRR
BFFBBFFRRL
BFFFFBFRLR
FBBBBBFRLR
BFBBBBBLLL
FFFBFBBRRR
FFFFBFBRRL
FFFBBBBRLR
FBFBFFBLRR
BFFFBBFLRL
FFBBFFFRLR
FFFBBFBLRR
FBBBBFBLLR
FFBBBFBLRR
FBFBBFFRRL
FFFFBFBLRR
BFBFFFFLLL
FBFBFBBRLL
FFFFBFFRLR
FFBBBBBLLR
BFFFBFFRLL
FFFFBFBLLR
FBFBFBFRRL
BBFBBBFLRR
BBFBBBFLLR
BBFBBFFLRL
BBBFFFFRRL
BFFFFBBRLR
BFBBFFFRRL
BFBBBFFLLL
FFFBBFFRLL
FBBBBFBLRR
BBBFFBFRRR
FBFBFFBLRL
FBBFBFFRRL
FFFBFBBRRL
BFBBFBBRLL
BFBBFBFRRR
FFFBFBBLLL
BFFBFBBLRR
BFBBBBFRLL
BFFBFBBLLR
FFFFBFFLLR
FFBBFBBLRL
BFBFFFFLLR
FBFFBBFRLL
FFFBBBFLLL
BBBFFFFLRR
BFBFBBFRRR
FFBBFBFRLL
BBFBBBBRLR
BFBFBFBLRL
BBBFFBBLRR
BBFFBFFRLL
FFBFBFFRRR
FFBBFFBRRR
BBFBFBBLRR
BFFBFFBLLR
FBFFBFFRLL
FFBFFFFLLL
FBFBFFFLRL
FBFFBBFLLR
BFFBFFBLRR
FBFFFFFRLL
BFBFBFFRLL
FFBFFFBLRR
BFBBBBFLRR
BFFBBBBRRR
FBFFBBBRLL
BBBFBBBRRL
FFFBBFFLRR
FFFFBFBRLR
BBFBBBFRLR
FBBBBFFRRL
FBFFFBFLLR
BFFBFFBRRL
BBFBFFFLRR
FFFBFFBLLR
FBBBFBBLRL
FBFBFBBLLR
BFFFBFFLLR
FFFFFBBRLR
BBFFBFFRRL
BFBFBBBRLR
FBBBFFBRRR
BBFBBFBRLR
FBFBBFFLRL
BBBBFFFLLL
BBFFBBBLLL
FBFBBFFRRR
BBFFBFFLLL
FBBBFFFLRL
BFFBFFFLRL
FBBFFFBRLR
FBBFBBBLRL
FFBFBBFLLL
FBFFBFFRRR
BFFFFFFLLL
BBFBBFBRLL
BFFFBFBRLL
FBFFBFBLLL
FFBFFBFRRL
BBFFBFBLLR
FBBBFBFRLR
BFBFBFFRRL
BFBFFFBLLR
FFBBFBBRLR
BBFBFBBRRL
FFBFBFFRRL
BFFBBFBRRR
BFFFFBBLLR
BFBFFBBRLL
BFBBFFBRRR
FBFBBFBRRL
FFFFBBFRRR
BFFFBFBLRR
FBFFFBFLLL
BBFBBBBLLL
BBFFFFBLLR
FFFBBFFRRR
FFBBBFBLRL
BFBBFFFRRR
BBFBFFBLLR
FFBBFFBLRL
FFBFFFBLRL
BBFBBFFRLR
FFBBFFFRRL
BBFFFBBLRL
FFFBFBFLRL
FFBBFBBLLR
FBFFBFFRLR
BBFBFBFRLL
FFFBFFBLLL
BFFFBBFRRL
FBFBFFFLLL
BBFFBBFLRR
BFFBBFBLRL
FFBBFBFRLR
BBBFFFBLRL
FBFBBBBRRR
BFBBBFBLLL
BFBBFFBLLL
BFFFBFFRLR
BBBFBFFRLR
FBBBFFBLLL
FFFFBFFRLL
FFFBFFBRRL
BFBFBBBRRL
FBBFBBFRLL
BBFBBBBLLR
BFFBBBFLLR
FFBFBBBRRR
FFBFFFBRLR
BFBBFFBRRL
BBBFBFFLLR
FBBBFFBLRR
FBFBBFFLLL
FBFBFFFRLR
FBBFFFFRLL
FFBBFBFRRL
BBFBBBBLRL
FBBBBBBLLL
FFFBFFFRLR
FBBFFFFLLL
FFFBBFBRRR
BBFFBFBLRR
FFBFFBBLLR
FBBBFFBLRL
BBFBBBBLRR
FFBFBFFLLL
FBBBBFBRRR
FFBBBFFLLR
FBFFFBFLRR
BFFBFBBRLR
FBFBFFBRRR
BBFFBBBLLR
BFBFBBFRRL
FBFFFFBLLR
FFBBFBFRRR
BFBFFFFRLL
FFFFBBFRLL
FBBFBBBLRR
FBBBBFFLLL
FBBFFFBRRR
FBBBFBFLRR
BFFBFBBRLL
FBFFFFBRRR
BFBBBBBRLR
BBBFFBBLLR
BFFBFFFRLL
BBFBFFBRLR
BFFFBFBRRR
FBBFFBFLRR
BFFFFFFRLR
FBBFFBFLLL
BBBFBFFRRR
FBBFFBBLLR
FBBFFFFRLR
FFFBFFFRRR
BFFFFFFRRL
FFFBFFFLRR
BFFFFFBRRL
BFFFBBBRLL
BFBBBBFRRL
BBBFBBFLRL
BBBFFBBLRL
FBFBFBBLRR
BBFFFBFLRL
BFBFFFFLRR
FBFBBFBLLR
BBFBFBFRRL
FFBBBFBRLR
FFBBFBFLLL
FBBFBFBRLR
FBFBBBFLRR
BFBFBBBLLR
FFBBBBFRLL
FFFBBBBLRL
BFBFBBBRLL
BFBBFBBRRR
BFBBBBBRRR
FFBFBBFLLR
FBBBFBFLRL
BBFFFBFRLR
FBBBFBBLRR
BBFFFFFRLR
BFBFFFFLRL
BFBFFBFRLR
FBBBBBFRLL
FFFBFBFRLR
BFBFBFFLRL
FBFFBFBLLR
BFFBBBBRLR
FBFFFBBLLR
FBBFBFFLLR
FBBFFFFLLR
BFBBBFBRRR
FFBBBFFLLL
FFBBFFBRLL
FBBFBBBRRL
BBFBFFFRRL
FFBBBBFLLR
FBBFFFBRLL
FFFBBBBLLR
FBFFFFFLRL
FFFFBFBRRR
FBFBFBBRLR
BFFBBFBLRR
FFFFBFFRRR
BBFBBFFRRR
BBFBFBFRRR
FBFFFFFRRL
BFFFFBFLRL
BFFFFFFRLL
BFBFFBFLRR
BBFFBFBRLR
FFFBBBFRLR
FFBBFBBLLL
FBBBBFBLLL
FFBBBFFLRR
FFBFFBBRLL
BFFBBFBRRL
FFBFBFBLRR
FFBFBBFRLL
FBBFBBBLLL
FBFBBFBRLR
BBFFFBBLRR
FFFBFFFRRL
FFBBBFBRLL
FBBBFBFRRL
FBFFFBBRLR
FFFBFFFLLL
BFBBFBBLRR
BFFBFBFRRL
FFBBBBFLRL
BBBFFBFLRL
FBFFBBFLRL
FBBBFFFLRR
BBFFBBBRRL
FFBBFBFLRR
BFFBBBBRRL
BBFFBFBRLL
BBFFFFFRRL
FBFFFBBRRR
FFFBFBBLLR
FFBFBFBLRL
FBFFBFFLLR
FFFFBBBRRL
BFBBBFFLRL
BBBFBBBLLL
BBFBFFFLLR
FFBBBFFRLR
BFFBFBFRRR
FBBBBBBRRL
BBBFBBBRRR
FBFFFBBRLL
BBFBFFBLRL
BFFFFFFLRL
BFBFBFFLLL
FFBBBBFRLR
BFFBFBFLRL
FBBFBFFLRL
BFBBFFFLRL
FFFBFFBRLL
BFBBBFBRRL
FFBFBFBLLR
BFFBFBBRRL
FBBBBFFLRR
BFFFBBBLLR
FBFFFBBRRL
FBBFBFFRLL
BBFBBFBRRR
BFFFFBBLRR
FFFFBBBRLR
FBBFFBFRLR
BFFFBBFLRR
BFFBBFFRLR
BFFBFBBLRL
FBFFBBBLLR
BFBBBFFLRR
BFFFFFBLRL
BBBFBFBRLR
BFBFFFBLRL
BBFBBFFLLR
FFBBFFBLRR
BBFBBFBLRR
BFFFFFBLLR
BFFBBFFLRL
BFFBBBBLLR
FBBBFFFRRR
BBBFFFFLLR
BFFBBFFRLL
FBBBBFFRRR
FFBFBBBLRR
FBBBFBBRRL
BFFFBBFLLL
FBFFFBBLRR
FBBFFFFRRR
BBFBFBFRLR
FBFFFFBRLR
FFBBBFFLRL
FFFFBBBLRR
BFFBBFBRLL
FBBFBBFRRR
BBBFBFBLLL
FBFBFFBRLL
BBBBFFFLLR
BFFBBBFLLL
FBBFBBBRRR
BBFFFFFLRR
BFFBFBFLLR
BBBFFBBLLL
BBBFBBBLLR
BBFFFFBLRL
FBBBBFFLLR
FFFBBFBLLL
FBBFFBFRRR
FBBBBFFRLR
FBFBFBFLLL
BBBFBBBLRR
FFFBFBFRRL
BFFFBBBRRR
BBBFBFBLLR
FBFBFBBLLL
BBFBFFBLLL
FFBFBFBRRR
BBFBFBBRLL
FBFFFFBLRR
BBFFFBBRLR
FBBFFBFLLR
BBFBBBFRLL
FFFBBFFLLR
FBBFFBFLRL
BBFFFBFRRR
FBBBBBBLRR
BBBFBBBRLL
BBFBFFFRRR
BFFFFBBRRL
FFFBBFBRLR
BFFBFFBRRR
BFBBFBFLRR
FFBBBBBRRR
BFFFBFBLLR
BFFBFFFRLR
BFFBFBFRLR
FFFBBBFRRL
FFFBFFBLRL
FFFFBBFLLL
BFBBFBBRLR
FFBBBBFLRR
BBFBFBBLLL
BFBBBBBRLL
BFBBBFFRLL
FBBBBBFLRR
FBFFBBFRRR
FBFFBBBRRL
BFBBBBFLRL
BFFBBFBLLR
FBFFFBBLRL
FBBFBBBLLR
BFBBFFBLRR
FBBFFBFRRL
FFBBBBBRLR
FFBFFBBRRL
FBBFFBBRLL
FFFFBBFRRL
BBFFFBFLLR
BBFBBFFLRR
BFBBBBBLLR
FBFFFFFLRR
FFBFFBFLLL
BFBFFBFLLL
BBBFFBBRRR
FBFBBBFLRL
FBFBFBBRRR
BBBFFFBRLR
BBBFBFBRRR
FFFFBFFLLL
BFBFFBFLLR
BFBFFFBRRL
FFBFBBBLLL
BFFFBBBLLL
BFBBBBFRRR
BBFBBFBLLL
FFBBBBBRRL
BBBFBFFLLL
BFFBFFFRRL
FFFBFFFRLL
BFBFBBFRLL
BFBBFBFRLR
FFFBBFFLLL
FFBBBFFRLL
FFBFFFFRRL
BFBFBFFLRR
BBFBFBBRLR
BBFFFFBLLL
BFFBBFFLLR
FFFBBFBRRL
BFFBBBFRRR
BFFBBBFLRR
BFBBBFBRLL
FBFFBBFRRL
BBFFBFFRRR
BBFFBFBLLL
FFFBFFFLLR
FBFFBFFLRL
FBFFBFFLLL
FFFFBBFLRR
BBBFBFFLRL
FBBBFBBLLL
FFBFFFFRRR
        """.trimIndent()
    }
}

/**
 * DAY 6 PROBLEM 1
 */
object InputDay6Problem1 : Inputs() {
    override fun getInput(): String {
        return """
lqhksfnerg
negsc
snage
engs
sneg

ctfzrdbsapql
srldfatzqcpb
qsntlprfdbza
ldptswouqbxzafr

ncjolhqfbp
gphonqbflxj
jepdmfhsqtonz
cqpihonjbgf

abytu
ayu
ayu
uhodlay
uay

kzx
xjwk
kxfhsdc
xjk
jkx

rwxckmfn
xpcrkft

ntaf
lacuserbk

sxwdfmnpl
xpsmnwlfd
lpxmwsndf
xfdmlwnps
pwlnmdsxf

gjvcfamuty
uqfmjgzatpvyc
yfcjtavghm
amqfjkpgvyct
svgcenmylotjafbx

yepqgs
nsfqwghce
segvq

mi
l

eirgvuadbphcfsmyqnzotxjlk
qjeintsxubmfchoavpyzglrkd
fdjeyhbxgqclsnaimoptkvruz
iexuntjgmvfhqykspzbdclrao
hkjgpqlyaxdtcnvobmrzifuse

i
nl
on
zbp

aqpjnkeowivfbdhgr
pgiojefhvrqdawknc

ugmsibf
msbigfu
csgfimubj
mfisbgyu
nsmvuigfbe

demjnxcwbsri
aypesftqhzluko

ecoxhl
lochex
chelox
xhcoel
cholxe

xntubrdemhylsoi
gfjihrutbaewzpoxlys

iuqkewnyv
uyptkn
nyupsk

e
f

bxrsntkjdwivceapq
cqbakpimsvetnjxwrd
knvxqwpasurcodietbj
xvrqbdjiwsacykpent
npsavtbqxijkewrczld

pk
qpwsk
zpk

qdchnb
qwxbcdhyir
jhbdcq
hnecdbq

tdryep
th
vxg
bre
e

f
d
d

rspjhlqocixnw
xicoqjpnlwsh
lxinqphjoscw
jhlowspincxq

qptb
btpq
guqhbtpd

nzloqtcxmfgdbj
tcfdnbmzgqlxo
bqkgnxazecltidsoymf
wtzmxcpflbongdhvq
zfroctngqdbmxl

kcyhtoendvzwafbmuj
eltymcnhaowbkdzvuf
sfkmvobdnteuychzaw

wetrpdnqab
qrpkenabgwtdl
nahwtbrpdsef

hqbtefp
xslnrykmvau
zghcqtojidw

gqsyhx
vcent

pazioqhkbd
qnopbmrahdyk
dxbmkhaqotp
vkhaofqcdp
kqpzhaod

ytljngqdmxfck
tcjmkfnqlgydx
mfctkldxqpjuynvg
ldtfnycxqkmjg
lndxtfkymgjcq

elrfwpobjxa
mtpfoarbsdj

qigtfkwhobpvrcyzjuelnd
zcawdbogrhqnlieyufpkt
hqlzcnrikfypswutoxbegd
butncgpyovzrlfwideqhk

ozdnivyjlwkp
venpbsuzlodyw
xfdqnzhwyopvltcr
aizdgmlywponv

tqg
qt
rqs

whm
vadomyl
wmnqh
gwmps
mcnu

loav
zdl

vsleinyhgo
kshrxvaymptw
cqsubvf

ofd
fod

pdjrszhgkfe
dfshzegk
edhzfkgs

wti
ftcwib
iwtoz
wiut

joebqrhgxvst
alkgprwetohvznqdmcb
vbrgeoqhyjtix
thrfequgbxvo

ejx
ezfmnx
iderjhxc

hfrqe
rjambh

ytsdznehwg
dwrohqyvmscgjz

xdatzefv
kcxwhypoanlr

tbvdcol
tblcodv

kg
kyg

wxtezyuomkfdhspqjcn
xuoqwtphyckfjndzsme
ouzwykhqfcndmspejxt
ncemfpxsquzwyhdtkvoj

dyfvmobrspnlguqaw
vhalnuwbypod
xjuawvbptnyohld

bmytkawjszl
jaystwzmkl
msatlkwzjy

vghcafoer
graecvhzo
uavrcoheg
rhgvcaoe

nvjga
avgni

g
a
g
g

otxj
xtjqo
xtoj
jxntoy
ltqjxoa

i
ji
i
ai

w
pw
qutdebyio
w

camyzohlbrgd
ygcalmzbrdoh
hrbycdzmalgo

hgsltxvwmc
loxsntghvdc
sgxclthv
ctvxlshg
yxcvsgthlf

ekizadqujopgx
zuagvjsirokwpx
uoykijgpqaxzc
gqkoixpyabdjuz

qjygvhmlkdbzsifcwapuonxrte
desvfncpryjamkzhgutwoi
nifhzpertsgmycjwauokdv
swohafgetuyvicpzjrnmkd

dybpeckxz
zucgeyipqdnl
wspyefczlnhd
prevcytzod
pheyjdwzc

vbpfnedqyoawhcr
qrhcewvabfopdnmy
afrvebhdocniykqpw
foqeawrbvyhpdcn
ncwaphbvoqdrfey

dwj
wdzj

mr
rm

idnkmufx
demjykixo
kjdmxiov

ukbflqhomzrwastyjgpex
voqkyihjufmxswgrztbc

tjn
njv

ruika
irkua
wairlkszu

rfgphcezl
zcreg

mce
mec
qsme
mpeyf

wjcxoftvnr
zomvfjnyw
nywjofvtm
kvwhfunajolsigq

y
n
n
y
oe

nvjkryifxace
ziehtgnjfbyrlvka
xnpvjismakeyfr

g
g
g
g
g

vwgnj
ivoj
ugjv

myzrbf
ymczfr
vmwroxhfj
mlfdr

ajqerszpbdyvoufwlmgcnitxk
wmzuftgdkavjrlibenpoqxcys
gnpmcsxlwzvfateqdirkyujob

bnfudi
inay
iuncv

trqlgxaeouy
uvoqxktwejyr
otqeuxyr
xogreiyqut

ficdymxhuboq
dvwiuexfc

zbhndug
ugsdwphnv
nugdwh
dughnjio
jgsyuhnd

f
qrcvkfu
f

yvf
yfv
yfv

qtnc
cbqn
qnc
tcqn

rxyhizgjklumv
fidxgjlkyhvr
avncxqrjbkgplhiy
zrdkxtlgjvyhi

zjq
f
u
prgot

hrgktyczsvnmiolewbf
gbowmtzvynferksichl
svgbrzmcolkieynfhtw
vehwtyrmgsnickfozbl

lbucxdo
jlcgdxiu

hvtafpnwzex
vnxzwftehp
hezxvnpfwt
tnehfxvpzw

wbmyejlv

gevqi
eigv

unogtlfwvcyjdr
jcuvlftdgnwroy

kdlm
pklw
klfay
lk

somjqeuvdk
rzaqodkmvxsj

g
g
g
g

ceihqtrjpbxso
xohipcersbqj
pibhoxsrjeftcq
pbcqvosehrjix
icbqhosrpejx

jvldsruex
oktrdvslcujx
xdurvpjsl
mxesdiujvrl

rgcdsax
alqsbd
fdavzs
ijsutahdpye
baqdsz

jxcabgpuimtekqsy
iduqmetsognaybxp
yqwaburlxps

ulesvzoijdnpfhkacwmxbrty
zvxrdjskefbthimwnpayoul
ihdnlkxrpgwjbyevozuatmfs
yixowledpbvrthjkzufsmna

hxibvuzdowysmflpkqjgacnr
bhctimdakyqlsvxwjprounfg

xolza
axzl
xazld
lzoax

vjpdirbzwmcyeqtfgoulhsk
shzpugkqlobmridvjyewfc
ybufwljhrcdegsiozqvkmp
ucnbokilmgvqwjzsfphaeryxd

fzwiyxutvmdpbqkgrj
vmqludbfywzkxpijtg
qwkuzbfxyjmdptigv
pmgifdkjtbuzywvqx

jvxwlqr
rqfjmsveoaw
ptbyhvjqw
qwkvjxg

qnaxrduhpfvoyjbksgw
qjnwieaoxrsfpzdhk

nrcmyksodhaztijuwblv
ksxrufaqhwbcnme

sqx
sjbql
gsqnpwk
sq

cpgkrjvqx
vgkpqcxjr
qjxckapvorg
xjvqckprg
gkqrcpvxj

ojyziuqkbe
fvuceart

qpgyknd
kfvyjtd

phfmqdwxnuvgo
ouxdblhnmpgq
amxnpihkdusoqr

run
dnx
vnc
ponklq
nur

ixoytfqugrvjzcdwlhkbesmp
qalryztjxumhevifnobpcgdw
bothiuxqjzefcglpwymdvar
lgfjctrixhzudaqmebpvoyw
zlwfoituxvdpqbejhycgrm

lrwvkj
jqwc

awvyst
vtysa

ugxys
x
x
x
x

ismv
mfi
ihofm

lijwuxcbrfotekpangzmsvyd
onmsdklutybrcqavegwfxijp
vnyarmslcetoxjkwuqgdipfb
jtrsdmfcnwiveyxlobhukgpa
msatlerkovjnfgdicuywpxb

xmyen
enymx
myxen
xyemn
xymen

oaustqdifyxepkrwh
kbcvmrjn

uqv
qrvw
qv
vqtmu
qv

lo
l
l
t
l

aoqujemitxrszgnywvlc
lauzwhvr
akulrbdzwv
lrwdpvhauz

jhwycgso
trshda
hs
sh

oydxjrhetainw
nbwdxloetyiar
entcioxrwadyh
tonyexrpdawi

bkdrqlnjwshi
nkidbwshrqlj
hrqvfldjinsbkw
khdbsnwrjilq
wjnipadhqkrlbs

iusqovtzgajpndcwl
icstgzpurhbwqnvjoka

hvwcue
chwnejv
cxwvath

yroksb
tbs
swb
sb
sb

vgixnfosrpetb
rwpndfevylg

alytpjgxn
styjnkmegil
npfyakjgxlt
vzdhtlonwygbjq

dp
dp
pd
dp
pd

cav
i
ac
chzu

kdv
fld
dwq
qds

x
wanxl

cfborlazjq
pfcloajrwqbz
btonaqzidlfrgjc
lcfjzqsroba

o
n
kwl
s
f

oylasgwtbnu
wstxylzug
ikjvuqwltyhgs
ultbomgwnsyax

iotqspcwuhr
uplinrgcvhews
tduspchwrim
sihrcbquotwp

qjdnkl
ldnqa
qdiknl
qdmnlv
sltxwbqnyd

rnzmybp
zfnwc
nkazdqg
uzesvmjn
vzn

emp
epm
pem
mep
mpe

zxhde
demhz
jadu
ckrpvglsw

pegn
gnep
pgne
engp

hjkeoyrglpcitbva
ubtzsmvakoly

u
b

ksanb
sbk
sbk
skvxdb
bkfs

z
z
zo
wuqmz
gz

jwbyaugknetqrmoxh
axwnmobetrjqkdyuhg
omvjbyhngureqxkatw

lqdiban
ifbazln
bafzinl
ifsbanl

dovkxjylabqmtizw
pawvoxdmbyizqtj
vwubiayopgxcjzqdtm
qbjtvowdnzsixamy

ykpusjaqclowb
kjsclynwqapobu

zasypunbwitorjvmeglqxhkdcf
bvlirhqwgskftxedonymuapcjz

ezxghwr
rzgxnewh
erwxzhgv

nkfvplstgaybmhorewzu
lakohrfuznjdsqvgmywp
tuyshcfwkpabzomglrnv
clnsrgvowhufamykzp

gbrln
pb
b
bsw

ugcnskomzepjvxifrtwq
vpmkutefjzgwrbsoncxiq
cmkesufoxvqprwidzgntj

rpsheibkg
bokwgjeh

sfwgbm
jmfgbws
sgfumwb
bfmgws

qfxderyt
ikwyln

nsrjpbtxuvcfgl
putvcjfrdlsonxegb
vgbjtrlsfxcpun
lnbgctvmsjrxiufp

cnawzexsdlubpm
bufnvdiaxptlcmse
lbyugexmdncspa

xtvpcfsdzewmgaqb
felcxvdpiqnuymow

xoqt
tqxp
gtfqjkvbu
tqa
qta

jplacdti
apfliojtcb
ilcapjtk
atcjilp
tuipnjleyasc

by
by
yob
by

m
mp

kenjrtgyvxiqwmazchfbup
dezplgiwyxrq

ra
wa
aw

qldpihtceyfoksa
cfsopeatkilynqrdv
xctlfjsoapiguyqdke
syiupwbjlacefokqdt

sc
twsq

ewc
ce
ce
ceiaf

wnqfklygehirdxazup
vqgepxnsziakrw
eznxgqwpriak
irnqvzwkpaxbeg

gu
au

ujvidwoe
jekiubdov
idunjveo
eidvunjo
evinoyduj

irytzs
jhnr
r
mnrjdb
rnv

ug
gu
ug
ug
ug

ifndua
rafyduin
ufhvnadi
dyguamifn

aihwljuqkezp
wzaiqlp
iplagzwq
qwizmpla

pvedlxntwjf
veldpnftwj

xvglbzusemwqihn
vkdbefxrtimp

spcwi
pjewi
idpyfb
ivp
pwzioj

e
v
za
z
g

mjvxyaguoc
qlhypbgw
qegylr
gklyrniw

tv
l
l

tmrzoldvsiu
owzpglsidvtmu
hmtjvlodxsubyzi
tuvilzdoksma

yenvdmsagq
nihfbxaymg

hcylanqdjmwrpixbo
qmwxybpcdalohn
mxwoazyphndcblq
wzbydamnoqxhcpl
mnlcadybwxpqoh

miupnhbvj
uwpnbhxjqiv

rqgta
awkxo
hzjsdb
awfu

gskncrox
npulc

iugzcseolh
gshioluezc

jqbi
pjqi
bqj
njoqv

eitjbcr
lpskbhyfrgxuzoiawv

fejdyanx
cyfjekxdon

gqzniubejkx
zjingbqhuexk
gknzxqcuijeb
uxjnzvergikybq

wub
w
tarx

ghpi
hiasg
ahip
yicd

brysq
hkgfbnmacr
wprtbyqls

lzfqot
qolfz
lqfzkor
qopmzdeflcx
toqflz

vhremdpywtabokuilx
oryhfcztaixlvmdwup

mwvqzngluxpcoeidk
ufcgnxjvmdzqikhlpw
lwvkxmciuepndgqz
glmzpqknieudvxcws

ibrduwhlcxtsnpyvamekzjf
zmuevtynhpfskralcwjxibd

rvdpebnwsiugmaqzxj
sidlbyakwrhvgmjoef

q
q
q

jofkmbcunaxet
elqngabhskmy
wkmxacenib

ezfpogadrbulys
sbamgenyopfzu

utagkdzvwoqemchb
zthluvqinacgb
qcjhvutilznabgy

gduwcpj
bcxgdswpurj
pujdwmcg

zxcagirye
uzrljgq
gwtzhfrb
dxrgze

m
m
m

mzf
zfm
zfm
mfz
zfmo

ovdqzm
dmqvoz
zmdqvo

bisprlndef
abvltrnkxd
rndbyl

zmglywve
lyvegwz

gtmrhpujzfqskoxavydie
typwiahqfnkdumvgoxresz
qzevtxauogipcksyrhfdml

rcova
pjcab
upacjb
alc

kzp
kpz
yz

aivymnlux
myuxvlias
lmyauixv
viumlxay
iyavulrdexm

smgjbqifah
bixgqsfmha
gsfqpnmhbilae

yb
fy

hfvcgd
hfkxcugdo
fhemcdgo
hgqfxdcy
begthcfrdqi

gcwtjyluzvbsnrkopmeai
uzbtyinrqmofsjdkcvwega

s
s
s

dsvpg
gdp
ndegr
digp

jiylzgcomkurtvqpa
yvmjtapingcruo

auijcbwfqkxyshl
xwhcyqukbislfaj
yiqcljkxfasruhbw
cjlfkxyqwuhiasb
iayklqhucsjwxbf

z
s
s
si

brayc
cykwbra
rxbcva
ckdabrh

rlfvawcqemhub
ctuqfsbaehm

wbrzpyacqhi
bmpalyhzgrc
vbazpnyshk
hzyijfacbp

wgjohx
sxhjgwo

alhkqy
dahfmjlcy

g
g
g
g

lpsbynokvrudcgzqmtijhx
snuhqjlokypfrbvcmidxg
yhwbjmxopvirguqscnldk

mwzsclu
yuwslzm
alsumwz

maj
mjxal

asgryznlwqjdfcpkehbm
knehsopgjdrqa
dnapshekjgvqr
ajendtksguqphr

puznxmqsrtfdckvyijbalg
kcgytbmsxvrunqjzlfaip
yuikxpqtafvbnszgjmcrl
qkvagxcjslbytnifpumzr

pglvfdihqa
pntwkbzeco
ep

fpjmzitnlkvbd
qdbknvtjfilrzm
bijznpmlkdtfv
otbjfznlmvdhsik

x
x
gx
xk

b
qge
kycnzjw
pixlb

cpzgaufikyltmbqvesoj
fusibtgoayvjqkpe
ovtfbasiekjugryqp
iubyfkjqvsoepgat
akofugibyqetpdsjv

yirboahn
ozvha
oah
hoav
aehco

hspqcxmjrbfyktngi
sptqigfklmadncxrvybh

wdksztumeroaplhxqbyvjfin
tadflskombxyhqewjrvipzn
afrejdkobnhstqyilpmxvwz
vzynhwtafpdqlkjoirxmebs
kqjpwxrdvtizfmlhenysbao

wonxesaihurqkymd
sxyqkmwdbnljrgueiao
whenxordaumqksyi
krouemnawsidyqx
rmsukxeyqonwida

ckywportslfhdaqixvmjn
gkvlapqwfscjzruoy

dtevjz
feqndzgxlvrtboc
zteuvkd
dszvuheti
tvdewz

ehaqfwylskdbzvmpgt
vagbfeqwptszykhmld
arpzbsvmweytfugjdchqlk
gpmvqkawhdstzlyebf
btaesiwkvpfdhzymlqg

hozuack
yuaznf

ozvmpady
paydovmz

gtmbeikr
breigtmk
gebkritm
kmibgert

jm
m
ml

frexcnogyv
nrvgyzilodxufeh

btvzjpu
zjvtubap
btzujpv
jdeptzvub
bvzpjqut

fkdcirhqt
cidhrkvfq
icqdhrfvk
vktrchidfq
ldqascokxrhfig

tlgjdsoapmciey
gitdwojaeslmynpc
dtycalegpmosji
mydoitvespcjlga
gladijvyoctfsemp

hwieujqgsxc
sgxebjhnuqwc
kqgcxwuhtvesj
qgecmsjxwhu
cwjqmugeshx

qjwldfsri
iqgbedvlsfrh
ujnldiksfqmpyrw

a
a
a

spotgrheckwqan
shwvnatgpkqcyoerz
hcgasrpewnoktq
tkewponscaqhrg

bjrsxkeiucnpoz
xrkczspbfeu
kqcuytdsrhvgplbxa

at
ae

x
x
v
x

ds
dr
xemdno

bvpdiocu
pzvhuyxci

a
u

d
d

rplowaxqj
rqvowa
yrombawnsteq
acujvqowr
wrxloaupq

s
k
k
k

zmn
pfgseobimq
mdkza
mzyvd
kwhmr

uqmtreg
twleuoqm

hm
mh
whm
hm

ydegnjfmkr
kvglzrfs

kovgzemjf
kfyighomzelj
fkzxtueogjm
fxkjozgmue
zofbvejmgk

zatrhwfjiopulke
satohknewfuipjlzrv
ekioxurwfljpztah
lgqzopirjkhwaufte

xgbozwltnevidfrjuhcysk
gwsmtbkroyfinadpjhevcxq

x
dx
mxzr
x

kaof
kodf
ofk
fko

rkuoazney
azyrqhtdo
yalobrzcw
xioayfrze

cusyzmjhqloftdpakegin
lmnjipdyogkfahuqstcze
mneocjwgilpfxzthsayqudk

m
hwyug
ymna
drptzijlc
wm

pg
pg

lrobg
orqfnsv
nqao
ojmwdecz

jmxlkan
mlauxtj
olcwmeaxqjnk
jxbpmltar
mljxdiszyagfv

sgriuf
ugmpoxvyq
dgzcuqwnh

m
e
m
y

dqkh
qdhk
hkdq

znfwuiodcryqsmbpvejg
xnqwcjrdebpzmgovysi
pihmyewrcgnjzqvdabsuo
tqdsnjwzovrbcgeiamfyp

meztpcwrsnojquxkg
mekurwxtncojsqg
ktjwqocsnugxerm

eplzc
ezpcl
lzypec

jmlrkseozxdunqf
dknseojuqzmlx
nsxqljdeukbmiz
sqmvnxubokizlejd
ctqsjmlkpwxzdunghe

klqgxyrdt
toykrdqgl

fwkzcuvmogxjrbelthi
zfhtgbqnomvwxku
fuozbthvwkqgmx

s
x
x

pefqgwzlimyjncouh
qaduwhmysxjopieftrl
ojfphequiwmnykl

ksfb
sbkf
sfbk
fbqvks

eomabw
wemarv

ghldr
iw
yj
po

lpihfvqersujkzyb
vjlfrebkiq
jblqifrevk

zgr
zg
zg
zg
gz

hfvydluaxgipsq
otqcbfurygsvempk
ljnqdswvgpufy

gdxbjivufyolq
usmbflyxiqdv

kpfy
yrfpk
fpyk

oencuyp
uceypoi
cypueo

orcfsjhvxaqynibuk
cbixuyokaqvrnhsjf
qcoyfjxukrsnhavbi
fkyuhbvojnsxaqrci
vrcshuqxyfniakojb

mvgbupxhfesodnzwjcq
dcjxzqyuepnvhfbsmgo
kpmzrsfebgaovnhcxu
npxgivuohmwsjefcbz

xaujvbesdqgnz
augndvqbcjfzs

eoyhpnrcldjbqfvtiua
laoyrgqzbuhndxwpvf

pxfnblvuzijhdq
hdkljpbz

jphqxmkwgsycurietbadzfv
vweygbzashxqcdji
wcbjdniysvhqeaxgz
dqxwhvbozjaiysgce
zwxghisaqbycjevd

bzqgcuerktfsavwhnoydi
rbvyqdsiokcuganewhtzm

tom
to
to
to
to

rkfmtd
vkcunbq
rk
kf

pkmifxjtwnz
kmsfanxteihjp
nmaftdji
ybqimuvojntf

ns
r
r
cvhm
wnias

mfsxucvboyj
cxomsbyvfj
fsbvomjyxc
mjhcvysbofx
xmfjcybovs

quxomeysk
uqtokyxsm
yqohxbkm
uyoqkaxm

br
rbi
brj

paqhkzmcwfrsiubtvjnx
zktiqbucarpwnxmyhj
aikmgtyucrjnpqwhxzb
jkabpxztcrwhuqnmi
mnxzwbaitqrkujhpc

szbanq
oegiflu
as
qpt
t

qsu
faqiu
qsui
uroqckjv

ufkcrahgitoyj
xknlcfujagd
gjcklauf
jkwafgcu

gdmxn
boiygrca
hgs

ybwclvjfkumxso
nvmkyowedlijuxcfsb
lzmqscybvxfukro

fiprvjsgcenhtmalxzqo
phcgntoqmeviajfxlszr
zsxqctnevliohrpagmjf
sqgipcuanmtxlrvjehozf
vlczqjgoipafetmrnhxs

ypwbf
pfwytb
pyfbw
btfwpy
ybpgwf

wrzhafdpmx
tzspfhxnd
dkfhzwst
bgelqjdcyfizvhou

peubvwgaqiclkfdxmsyjtr
kuwpsvlxbjrditgmqeacyf
btxejuiqcrpgslmadvfywk
gwalifqpdusrvmtjybcekx

qvmhulrt
wcpzdsifex

pohq
hqop
opqh
oqhp

en
iws
tpr
qs

lvfinmpcbzx
hkcsblgz
tcgzbkl
cblzw

rsjie
ewjribms
ijers

knizwxycoqe
dnqocbk
pkgsanof

hravnysejobwi
nlfusgdxtpqmaki

kuvboax
kjvohxa

qwm
mwq

xowbafsitjz
lawm
aylmw
wanur

qcdsao
dqaos
opaksqd

p
p
p
p
p

wl
d
l
n
rwa

rdi
dri
dir
ird
rdi

ei
e
e
e
e

favclpbni
icbfalnpv

uokmvxgafizceprnydsht
pkeaonhzruqxgvdfmscytil
fpxhsgcrutovzykaenimd
aszthkimoyxdufvcregpn

fgibsklo
dsokalnriegjzbf
kvwlocuys

icnortpmfwy
vnqrofpmycit

yaiempzjbvkgnrfco
tozadmejkbgqfcsiw

crgtkhbajzdmlp
epnsvfhib
pvbhn

fglxtqrb
uigxvbft
wxflbyg
xbpzndhfegj

jiolrqxfapuwdngybhktzcv
bnerupsdkflaqjzvitcmxo

znjus
qzsjna
znjs
uzjsn
zjxnks

snwj
w
w
pw
w

i
p
cd
qs

f
ofm
f
f

dv
av
cxkuo

rbxieoyczljtuqvm
gnphsrckqifzeljw

h
h
h
h
h

exghrdkbivqsmcwal
vhicaqdmlbrywxsgek
mrvcbskheadwliqxg
yrmckldaqeghisvwxb
algoshwxzmbrqjdevcik

omtswbxujpvfzd
yntcbxwl
aqtxyewb
tiybhgrkxw

srkxfjlgtpedai
digtrkjsxyapq
djxrgapiktse

fzlagmcnjwbd
chlzbgunwfj

qszghewkntxaomu
xekowrasunz
xnksoeawzu
wjxaoduensbzfk

oacfnvhugekystwp
ftncaykejwhbomz

abrcsi
xctrvokbsg
yaescfbr

vjwbpsleug
ghlwjekpbusv
jpuelswvfbg
yjwpvbeslgu
uwjegbpsvl

jkvqesnto
kjot
jkot
jotk
otjk

elf
nlg
vzl
yl
yl

rgbf
yrzmhbn
rbv
btrp
fzrb

uyetaqw
wheyaut
ateuyw
awyeut

swuaon
usnwao

udcyfksltzeqb
bkuycfstdqzel

gjmbfxieklohpc
oglhiuyxjekcmfpr
okelfixjpgmch

zixq
ziq
qgiz
iezq

sdbjl
vyjsdb
glkdnjb
hdefnbj
opjbmd

id
d

l
l

dsnze
senzd
dzesn

cegqnbzyhtm
ovaksmjwrdbpicxul

fzjxbck
ndjp
heyrsgaqm
tzof
xvdn

kxtimcjayh
syavicktmxh
mpxcfatihky
kyxitmcah
taxhmyickv

xlwjibshfgontek
njeixkslbogfhwt
hiwlbojxnktgfes

udsygjltikqrmv
tulkrgijvm
teumkjvlgir
vgjkulrimt
rghkmlvpejtiu

oegptdlksbixhcwqavjun
jacqedxslunipgh
enjgslzcmxupaqdih
zcndhlaqsepxugij
nqajehxpilcdgsu

shdieqwxflurjzby
wmtajifoqcupgnkb

xwck
ao

zkpfgvda
kdgya
qwnbiheos
jr
muxfjcl

wamxpysnl
qpydmrnj
nmypsl

k
xtvweuplk
aykc
kyf

uryfiabjvelptkmnsxow
pfcaoerluxdtnwjqbskm

wqenhkxgypc
dnltwxzaofs

srxmeabuodzq
oaeqdrubmzk
kdeaurobzqm

rfungq
gfunqr
rqgufn
nftougqr

jqthdmlfacp
liqumfdcj
qtjmglcskaf
lrbzwqyxoenmfjc

dgz
fj
x
g

qnhwlzjoac
wlzoajhcqn
jwqzcanohl
mwlzqonhjac

asqtlpwnrm
nparsmd
sarnmpf
nspamxr

ot
ozt

cuokwgjmhxzidteslq
ytfqwpieraosbjn

czoxdyvhasnit
zaxiovcynhts
juoyhvxatbnsiz

owsjger
oerwgjs
rwsojeg
ojswgre
ewjsocrgv

cmexibr
yxbir
irbx

nbgpodvsxmzfqiteuj
mnvtqbpxuszjod
jtsqpovbxndmzu
spxbzqmodvjtun
oumjnpsvztdbqx

vrwytk
kglvfrw
zxwusdonikph
mwgkj
warykt

rkdijofslupwqgtvaxhy
jzdsuprykoiwfvlxaq
wfboijqpurvslkxdya
skylwcmauoexpijdvqfr

pe
ep
e
eb
e

uzrmjehfktblxsivqpo
rovklpubzdsfiheqxmt
ekzuprvbtisxoflhqm
imuhkftvbrepzslqxo
fmrtxblpzeosuvikhq

oauifsgwqbtvkzxjycpml
kqmgzxjbwcoyiuvlatfps
pwjmqczoytaxgksvbiful
yqwsazxilvutcmbjopkfg
qtfdpxkmbzwacsgoiluyjv

ykcjafmxlbehuqtiwvs
zqxudnmysc
ngrpcymsqxu

qlyp
plqy
pqly
lyqp
yqlp

dtszxekb
sxrgbztedm
wsdnyxobqtl

oqmxabwknfy
mxyofkbqwaj

xfqrjeh
hfqrjex
qbfxrhje
xhjeqfr
oqhrixfjcse

pjaoerbtkqslx
fxkelnithrspa

tdrpcbksa
daksbcptr
abskdptrc

clidq
fqkmil
bioje

wjetbyvxhoumkp
bfyenwakpvotxm

adlqkrzvg
vlzaqgdr
zqdvryagl
lzarqgvd
arvlfqgdz

xfsb
xbfs
xgbzsjf

pbtrqilmkfwv
mkwflp
pkwflm
wfklsmup
wpkflm

qkjhnsczmueftdpbrgvixw
kdejtqhfswnbmupcgxvzri
ghxwkqupdtbvscrmnzfeij
fbmrgtkxjqevhywsdzcnupi
enskiwxgdtpbquchvrjfzm

u
u
u
u

fitcw
dfvzabyu

saewhufodzlxbjcrqivygmpk
jqxiopdmyluwkctsfzegbavr

zsdfpajrnvqk
bkaxzpsrndvqj
danpsvrqjykz
ujspgrndaovkzq
tljnarpzvekwqsdmhi

wyuemtvkdixl
direvlmytpnowauk
eigvlkwumyctd

jcrpnzalft
jacrutndpeixz
jczvantrepk
ergcajnptzv

iagonws
awings
wgiasn
anwsig
sngaiw

qogitsbfzmxk
kefoxbiqtzs
tisfzvxobqk
castjxbqpifozk
okbfsnidqtzxe

gocwh
otmhge
ogsh
ogh
sgho

e
y
ixmds

rtkcgwfx
tjxzckfhgbiw
aenyvmcfg

ngspdqwv
hziq
qx
yqtf
qjz

exgirhuwyjt
rxtuepwhgjisy
xtwyghrjeui
getuyijwcxrh
ughtwyxiejr

vdh
devh

y
y

m
m
mpv

ptvlsonebiqjwraxckumhzgf
lqtvbihsowmgeunckzjfapxr
xglbifczovtwrpqnmajeuksh
eoivpuqfcbhtnagjwkrzsxml
nubpeofjwmqvxgircahksztl

uyltcxrzjegmfwbkio
tgpxmuvsobicfej
esvgjxcfmuotib
xifognqmbtdujeca
bxhfmiejcgout

djaz
dajn
edja
tawdh

hyp
yhvp
ydph

z
z
z
z

jeixykzcrfd
zexmdjk
xkzdje

auih
uial
uia

ucwkeiadhgsr
ihswgkrudea
gwezhskryadnuoi

lvhmuranicfqpbt
bqhrlotfnzgacmu
fhdcslqwymbrutan

u
bj
pkb
pj
i

yg
mlyxo

q
p
u

yibeaxjpkcwsfm
ixpekjcaswmyrfbl
ecmbikjptafwyzsxq
sxfacbmiekjwyp

vyzhmwginr
scjl

s
c
h
s

qxhngcyijptvazme
gdiwlszqfbtvcpxnejhy
eghzaniykvpqotmjuxc

yasrbcwju
rzbacjug
abuzkxjcr

yjdgutwfreslm
jlutewfdgsmry
tglyjcefrswmud

cf
m
mn

zbwlnqrc
zwrpc
        """.trimIndent()
    }
}

/**
 * DAY 6 PROBLEM 2
 */
object InputDay6Problem2 : Inputs() {
    override fun getInput(): String {
        return """

        """.trimIndent()
    }
}
