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
 * DAY 7 PROBLEM 1
 */
object InputDay7Problem1 : Inputs() {
    override fun getInput(): String {
        return """
dark olive bags contain 2 muted brown bags, 1 mirrored tomato bag, 4 bright black bags.
faded coral bags contain 3 drab cyan bags, 1 light aqua bag.
plaid plum bags contain 2 mirrored cyan bags.
clear maroon bags contain 1 dotted turquoise bag, 3 dim lavender bags.
plaid coral bags contain 3 posh fuchsia bags, 3 dotted beige bags, 2 wavy turquoise bags.
mirrored indigo bags contain 5 pale orange bags, 5 striped aqua bags, 1 dotted cyan bag, 4 muted coral bags.
striped brown bags contain 4 faded green bags, 5 vibrant red bags, 3 drab black bags, 3 dark orange bags.
drab fuchsia bags contain 5 shiny chartreuse bags, 1 dark orange bag, 4 drab blue bags, 1 bright chartreuse bag.
light fuchsia bags contain 3 bright gold bags, 5 clear indigo bags.
plaid olive bags contain 4 striped indigo bags, 4 muted olive bags, 2 light gray bags, 2 wavy purple bags.
dotted green bags contain 2 faded yellow bags.
dotted cyan bags contain 1 light red bag, 5 dark cyan bags.
muted magenta bags contain 2 clear plum bags.
mirrored cyan bags contain 4 bright lavender bags, 3 mirrored gold bags, 2 plaid silver bags, 1 posh chartreuse bag.
muted red bags contain 2 wavy olive bags, 4 shiny cyan bags.
clear indigo bags contain 2 dotted magenta bags, 4 bright silver bags, 4 muted aqua bags.
plaid chartreuse bags contain 3 dark chartreuse bags, 1 faded lavender bag.
wavy tan bags contain 3 light red bags.
bright crimson bags contain 4 pale magenta bags.
pale yellow bags contain 3 clear plum bags, 2 vibrant cyan bags, 2 muted white bags.
pale tomato bags contain 2 muted red bags.
dull salmon bags contain 3 dark gold bags.
light white bags contain 2 drab chartreuse bags.
drab plum bags contain 1 dark brown bag.
shiny purple bags contain 3 pale brown bags, 1 bright crimson bag, 5 muted teal bags.
pale red bags contain 5 posh cyan bags, 2 drab cyan bags.
dull bronze bags contain 2 striped indigo bags, 4 plaid black bags, 3 clear violet bags, 1 dull chartreuse bag.
wavy indigo bags contain 2 dull coral bags, 1 dark tan bag.
vibrant silver bags contain 5 muted aqua bags.
shiny tan bags contain 4 pale beige bags, 4 bright gold bags, 5 muted coral bags, 3 shiny red bags.
dim yellow bags contain 1 dotted chartreuse bag.
faded white bags contain 5 posh lavender bags, 3 bright silver bags, 2 dark green bags, 5 muted lavender bags.
shiny tomato bags contain 4 mirrored chartreuse bags, 2 bright yellow bags, 4 vibrant plum bags.
dark yellow bags contain 3 plaid lime bags, 4 wavy lavender bags.
dim magenta bags contain 3 wavy violet bags.
striped white bags contain 5 striped chartreuse bags.
muted gray bags contain 5 muted brown bags, 5 light lavender bags, 2 clear gold bags, 1 shiny green bag.
drab white bags contain 4 muted yellow bags, 3 posh lavender bags, 3 faded fuchsia bags.
dark lime bags contain 1 bright crimson bag.
muted salmon bags contain 4 dull red bags, 1 dull violet bag.
muted black bags contain 2 vibrant black bags, 5 pale tomato bags.
plaid white bags contain 4 drab black bags, 4 drab cyan bags, 1 dim olive bag.
clear green bags contain 3 wavy purple bags, 1 pale gold bag.
drab orange bags contain 4 clear maroon bags, 3 vibrant gold bags.
light salmon bags contain 1 pale black bag, 2 posh fuchsia bags.
faded tomato bags contain 5 faded black bags, 3 vibrant coral bags, 3 bright brown bags.
dull green bags contain 5 clear lime bags.
dim orange bags contain 5 posh red bags, 2 dim gray bags, 2 muted gold bags.
dotted orange bags contain 1 faded tan bag, 2 drab tomato bags.
dull gold bags contain 5 muted gold bags.
clear beige bags contain 5 plaid tan bags, 4 dim maroon bags.
mirrored bronze bags contain 1 clear blue bag, 2 clear tan bags, 3 clear orange bags.
shiny brown bags contain 5 light tomato bags.
pale cyan bags contain 3 dull silver bags.
muted purple bags contain 4 posh brown bags.
pale maroon bags contain 1 clear maroon bag, 5 vibrant yellow bags, 1 shiny violet bag.
muted green bags contain 5 plaid plum bags.
light coral bags contain 5 bright lime bags, 1 dotted indigo bag, 5 shiny bronze bags.
wavy beige bags contain 5 light magenta bags, 3 pale lime bags, 1 faded yellow bag.
wavy turquoise bags contain 5 shiny red bags, 3 mirrored yellow bags, 2 posh bronze bags.
pale brown bags contain 2 striped salmon bags, 4 vibrant plum bags, 2 dull silver bags.
striped bronze bags contain 3 posh black bags, 2 bright yellow bags, 3 dotted silver bags, 1 mirrored violet bag.
pale tan bags contain 4 shiny lavender bags, 3 dotted turquoise bags, 3 pale turquoise bags, 5 plaid white bags.
muted crimson bags contain 4 dull lime bags, 4 pale magenta bags, 2 light cyan bags.
dotted purple bags contain 2 wavy magenta bags.
dull black bags contain 3 light crimson bags, 3 mirrored fuchsia bags, 3 posh lime bags.
mirrored aqua bags contain 1 dark brown bag, 5 pale gold bags, 2 pale purple bags, 2 vibrant crimson bags.
shiny beige bags contain 2 muted indigo bags, 2 dark tan bags.
shiny aqua bags contain 5 vibrant tan bags, 2 pale tomato bags, 2 faded blue bags, 4 pale magenta bags.
mirrored lavender bags contain 4 faded yellow bags, 3 light chartreuse bags, 2 dull crimson bags, 1 pale aqua bag.
faded gray bags contain 5 bright yellow bags, 4 light silver bags.
light tan bags contain 3 bright fuchsia bags, 3 light crimson bags, 3 clear olive bags, 1 clear silver bag.
dull crimson bags contain 3 wavy olive bags, 1 light maroon bag.
pale olive bags contain 4 vibrant purple bags, 3 clear fuchsia bags, 2 pale tan bags.
dim beige bags contain 3 dull silver bags.
dark bronze bags contain 1 mirrored orange bag, 2 wavy crimson bags, 1 dark maroon bag.
mirrored fuchsia bags contain 1 dark chartreuse bag, 1 dotted bronze bag, 5 shiny silver bags.
striped tomato bags contain 1 dark fuchsia bag, 5 vibrant maroon bags, 4 drab crimson bags.
muted chartreuse bags contain 1 light tomato bag, 3 light magenta bags, 3 dull beige bags.
muted violet bags contain 5 light tomato bags.
dim violet bags contain 2 mirrored purple bags, 3 bright black bags, 5 vibrant plum bags.
muted beige bags contain 4 muted plum bags, 4 mirrored gold bags, 5 bright yellow bags.
shiny coral bags contain 5 vibrant gray bags, 1 light bronze bag, 5 faded chartreuse bags, 2 plaid violet bags.
dotted yellow bags contain 5 dotted turquoise bags.
faded bronze bags contain 4 dull purple bags, 2 pale fuchsia bags.
clear fuchsia bags contain 5 bright yellow bags.
dotted beige bags contain 1 pale turquoise bag.
bright aqua bags contain 2 faded silver bags, 5 dim fuchsia bags.
dim silver bags contain 5 wavy brown bags, 1 light maroon bag, 2 wavy black bags.
plaid tan bags contain 3 dotted green bags.
drab teal bags contain 4 mirrored violet bags, 5 dotted bronze bags, 1 pale cyan bag.
plaid yellow bags contain 5 shiny magenta bags, 1 dark silver bag, 5 shiny indigo bags, 3 faded gray bags.
dull cyan bags contain 1 posh plum bag, 5 dim coral bags.
pale beige bags contain 3 dark cyan bags, 4 faded tan bags, 2 plaid silver bags.
faded salmon bags contain 2 light olive bags, 2 dark tan bags.
bright silver bags contain 1 clear fuchsia bag, 2 clear lime bags.
dark lavender bags contain 1 pale cyan bag, 5 dotted salmon bags, 1 striped turquoise bag, 2 dim crimson bags.
light gray bags contain 3 dotted chartreuse bags, 3 dull red bags, 4 bright gold bags, 2 light lime bags.
dark indigo bags contain 5 shiny coral bags, 1 muted teal bag, 2 plaid purple bags, 4 faded yellow bags.
light maroon bags contain 1 wavy brown bag.
dotted brown bags contain 1 clear violet bag.
pale indigo bags contain 1 wavy brown bag, 2 dark olive bags, 4 pale black bags, 5 striped lavender bags.
pale purple bags contain 5 bright chartreuse bags, 1 vibrant magenta bag, 4 clear tomato bags, 4 light cyan bags.
dim teal bags contain 2 dark salmon bags, 5 mirrored gold bags, 3 bright gold bags.
wavy olive bags contain 1 vibrant purple bag, 3 dull silver bags.
pale aqua bags contain 4 dark violet bags, 2 dark plum bags, 3 vibrant brown bags.
muted cyan bags contain 5 vibrant crimson bags, 3 pale magenta bags.
vibrant fuchsia bags contain 2 light beige bags, 5 bright purple bags, 3 light maroon bags, 4 dull beige bags.
bright blue bags contain 4 vibrant plum bags.
vibrant green bags contain 1 dark salmon bag.
dull red bags contain 2 dotted maroon bags, 1 posh salmon bag, 3 dotted chartreuse bags, 2 dim yellow bags.
dotted magenta bags contain 3 plaid violet bags, 3 light gray bags.
wavy bronze bags contain 1 posh plum bag, 2 bright lavender bags.
shiny orange bags contain 3 muted plum bags.
plaid bronze bags contain 5 plaid chartreuse bags, 3 mirrored turquoise bags, 3 light salmon bags.
shiny yellow bags contain 4 striped teal bags, 1 vibrant maroon bag, 1 drab indigo bag, 4 muted beige bags.
faded indigo bags contain 2 posh lime bags, 1 vibrant teal bag.
posh tomato bags contain 4 striped salmon bags, 3 drab red bags.
light plum bags contain 3 bright blue bags, 5 dotted black bags, 4 shiny brown bags, 2 clear tan bags.
pale green bags contain 4 clear maroon bags, 4 dull green bags, 5 clear aqua bags, 3 drab beige bags.
drab brown bags contain 1 bright plum bag, 5 striped indigo bags, 1 vibrant lime bag.
muted lime bags contain 3 faded tan bags, 5 vibrant magenta bags, 5 posh coral bags.
faded violet bags contain 1 posh purple bag, 4 muted crimson bags, 5 striped red bags.
striped green bags contain 4 clear chartreuse bags, 4 dim maroon bags, 1 faded cyan bag, 5 faded silver bags.
dim plum bags contain 1 faded tan bag, 5 vibrant crimson bags, 3 light gray bags, 2 wavy teal bags.
drab cyan bags contain 4 muted plum bags, 5 mirrored black bags, 4 clear fuchsia bags.
vibrant lime bags contain 2 pale brown bags, 5 plaid violet bags.
drab purple bags contain 1 posh turquoise bag, 4 clear violet bags, 5 faded coral bags, 1 striped gold bag.
mirrored gray bags contain 3 dotted orange bags, 4 mirrored tomato bags, 4 plaid lime bags.
plaid teal bags contain 2 dim coral bags, 5 shiny magenta bags, 5 striped beige bags.
vibrant white bags contain 2 shiny red bags, 1 plaid black bag.
faded crimson bags contain 2 faded yellow bags.
dim chartreuse bags contain 4 mirrored teal bags, 5 light lavender bags.
wavy magenta bags contain 3 dark cyan bags.
mirrored magenta bags contain 4 muted salmon bags, 4 pale maroon bags.
plaid silver bags contain 2 pale turquoise bags, 3 posh salmon bags.
bright cyan bags contain 3 dark orange bags, 1 mirrored gold bag, 1 light violet bag, 5 faded silver bags.
faded orange bags contain 3 drab red bags, 5 dark tan bags, 2 vibrant magenta bags.
wavy gold bags contain 4 drab tomato bags, 2 muted yellow bags.
wavy salmon bags contain 2 dotted bronze bags, 3 light white bags, 2 dotted brown bags.
posh plum bags contain 4 drab black bags, 1 light silver bag.
dim aqua bags contain 5 striped black bags, 1 bright yellow bag, 4 posh salmon bags, 3 striped salmon bags.
shiny fuchsia bags contain 2 dim cyan bags.
dark tan bags contain 3 dull plum bags.
mirrored red bags contain 3 pale lime bags, 3 dim maroon bags.
bright purple bags contain 4 posh magenta bags, 4 wavy magenta bags, 3 posh plum bags, 3 dull lime bags.
striped olive bags contain 3 bright lavender bags, 3 mirrored black bags, 3 bright gold bags, 2 pale plum bags.
dotted bronze bags contain 3 dull coral bags, 1 faded black bag.
shiny green bags contain 1 shiny indigo bag.
mirrored chartreuse bags contain no other bags.
pale crimson bags contain 2 light orange bags, 3 light lime bags, 4 dotted cyan bags.
shiny lavender bags contain 5 shiny crimson bags, 5 striped tan bags.
wavy blue bags contain 1 pale brown bag, 2 light cyan bags, 1 light magenta bag, 4 pale tan bags.
muted plum bags contain 4 dull red bags, 1 dotted maroon bag, 1 vibrant red bag, 4 bright chartreuse bags.
vibrant violet bags contain 4 dull brown bags.
faded chartreuse bags contain 3 dotted yellow bags.
drab chartreuse bags contain 4 shiny gold bags.
posh crimson bags contain 3 clear cyan bags, 2 light crimson bags, 1 drab crimson bag, 5 clear blue bags.
drab tomato bags contain 4 striped salmon bags.
clear red bags contain 1 pale blue bag, 1 posh orange bag, 2 dark aqua bags, 5 posh red bags.
drab lavender bags contain 2 muted gray bags.
pale blue bags contain 5 pale beige bags, 3 muted green bags, 3 shiny white bags.
posh cyan bags contain 2 clear aqua bags, 2 drab chartreuse bags, 2 dark purple bags, 2 posh salmon bags.
faded silver bags contain 5 dim salmon bags, 2 striped bronze bags.
dim green bags contain 1 dark fuchsia bag.
plaid aqua bags contain 3 dim red bags, 3 drab turquoise bags, 3 dim aqua bags, 5 dull salmon bags.
posh fuchsia bags contain 2 dotted fuchsia bags.
striped lime bags contain 1 dull silver bag, 5 posh black bags, 1 dark fuchsia bag, 3 dull lime bags.
clear olive bags contain 1 pale crimson bag, 2 shiny orange bags, 2 posh magenta bags, 1 dark fuchsia bag.
bright lime bags contain 2 striped tan bags, 5 dull plum bags, 4 bright yellow bags.
faded green bags contain 2 pale turquoise bags, 5 light lime bags.
plaid indigo bags contain 1 drab crimson bag.
shiny turquoise bags contain 2 faded crimson bags.
drab aqua bags contain 4 mirrored red bags, 1 drab gold bag, 5 wavy orange bags.
dim gray bags contain 1 shiny lime bag, 5 dotted fuchsia bags.
light teal bags contain 5 pale beige bags, 4 shiny cyan bags, 2 striped red bags, 1 light orange bag.
wavy red bags contain 3 dotted tan bags, 3 pale aqua bags.
vibrant red bags contain no other bags.
striped salmon bags contain no other bags.
clear silver bags contain 1 shiny orange bag, 1 pale aqua bag, 1 faded purple bag, 2 dim coral bags.
muted tan bags contain 3 pale maroon bags, 4 dotted maroon bags, 2 bright plum bags, 4 pale teal bags.
faded yellow bags contain 2 striped black bags, 2 dotted chartreuse bags, 5 drab chartreuse bags, 5 shiny tomato bags.
dark green bags contain 1 light lime bag.
striped cyan bags contain 2 posh magenta bags, 2 dim cyan bags.
vibrant teal bags contain 2 dim magenta bags, 1 bright chartreuse bag, 5 bright tan bags, 1 bright yellow bag.
bright red bags contain 1 posh white bag.
bright magenta bags contain 3 posh salmon bags, 2 dull fuchsia bags, 1 posh lavender bag.
bright white bags contain 1 bright chartreuse bag, 1 mirrored yellow bag.
dotted teal bags contain 3 bright gray bags, 3 vibrant fuchsia bags.
clear blue bags contain 4 pale brown bags, 2 drab indigo bags, 2 pale salmon bags, 3 muted olive bags.
dull brown bags contain 1 dim cyan bag, 2 vibrant plum bags, 3 posh chartreuse bags.
vibrant tan bags contain 1 dark orange bag.
shiny white bags contain 3 mirrored violet bags, 1 drab indigo bag.
clear violet bags contain 2 vibrant crimson bags, 1 light gold bag, 2 striped silver bags.
bright coral bags contain 3 drab blue bags, 4 muted olive bags, 3 faded purple bags, 1 vibrant maroon bag.
dotted aqua bags contain 5 wavy black bags, 4 mirrored gold bags, 1 posh red bag, 2 plaid silver bags.
clear crimson bags contain 1 plaid gold bag.
faded fuchsia bags contain 5 shiny coral bags, 2 pale beige bags.
wavy crimson bags contain 4 dotted turquoise bags, 1 light gray bag, 5 wavy purple bags, 1 faded gray bag.
dark fuchsia bags contain 2 wavy brown bags, 3 vibrant orange bags.
striped plum bags contain 1 vibrant cyan bag, 3 posh lime bags.
shiny salmon bags contain 5 drab magenta bags, 4 mirrored turquoise bags.
dim brown bags contain 2 shiny gold bags, 5 dotted cyan bags, 3 plaid cyan bags.
posh violet bags contain 3 dim red bags, 2 posh white bags, 3 faded aqua bags, 4 shiny gold bags.
pale black bags contain 3 pale plum bags.
shiny red bags contain 4 posh salmon bags, 1 dotted chartreuse bag.
dull olive bags contain 2 light blue bags.
bright olive bags contain 2 striped olive bags, 3 muted plum bags, 2 striped magenta bags.
posh brown bags contain 1 vibrant gold bag, 2 wavy silver bags, 4 dotted salmon bags, 4 drab orange bags.
bright tan bags contain 3 light chartreuse bags.
dull beige bags contain 2 pale violet bags.
light yellow bags contain 2 clear indigo bags, 2 wavy brown bags, 2 bright black bags, 4 shiny lime bags.
dull aqua bags contain 2 dull black bags, 5 posh black bags, 2 wavy fuchsia bags.
dark gold bags contain 3 clear fuchsia bags, 1 dark cyan bag, 4 dark orange bags.
wavy white bags contain 2 dark brown bags, 5 drab yellow bags, 5 dotted turquoise bags, 4 muted tomato bags.
posh silver bags contain 2 dim chartreuse bags, 5 light fuchsia bags, 4 faded purple bags, 5 drab cyan bags.
dotted coral bags contain 5 plaid silver bags, 2 posh beige bags, 5 dim beige bags, 2 vibrant crimson bags.
drab silver bags contain 1 posh chartreuse bag.
dull teal bags contain 1 dim indigo bag.
wavy brown bags contain no other bags.
posh purple bags contain 1 wavy purple bag, 5 muted gold bags.
faded magenta bags contain 2 wavy aqua bags, 4 vibrant beige bags.
vibrant magenta bags contain 5 wavy black bags, 4 shiny maroon bags, 3 dim tomato bags, 5 vibrant gray bags.
mirrored brown bags contain 2 light aqua bags, 1 clear orange bag, 2 bright lavender bags.
light crimson bags contain 5 posh chartreuse bags.
dotted olive bags contain 5 dim tomato bags, 3 dim plum bags.
light indigo bags contain 1 bright gold bag, 4 drab chartreuse bags, 4 dim fuchsia bags, 3 vibrant black bags.
vibrant chartreuse bags contain 5 dim crimson bags, 1 clear plum bag, 4 striped black bags.
pale violet bags contain 3 dark salmon bags.
bright violet bags contain 3 striped aqua bags.
dull maroon bags contain 1 drab aqua bag, 3 mirrored lavender bags, 5 dotted brown bags.
dim lime bags contain 3 wavy salmon bags, 3 striped tan bags.
dotted tan bags contain 3 dull yellow bags, 3 shiny violet bags.
posh yellow bags contain 3 dull crimson bags, 4 dim olive bags, 4 dark black bags.
dull violet bags contain 4 bright yellow bags, 2 posh magenta bags, 5 shiny red bags.
dotted silver bags contain 2 wavy turquoise bags, 3 dull tomato bags, 3 bright tan bags, 1 dotted salmon bag.
pale gray bags contain 1 plaid turquoise bag, 4 bright salmon bags.
clear purple bags contain 5 shiny gold bags, 5 faded teal bags.
striped tan bags contain 1 mirrored cyan bag, 2 pale beige bags.
dotted indigo bags contain 2 pale purple bags, 2 pale black bags, 2 dark salmon bags.
clear turquoise bags contain 2 light lavender bags.
wavy plum bags contain 5 shiny aqua bags.
muted indigo bags contain 5 drab teal bags.
muted yellow bags contain 2 vibrant cyan bags, 1 dim white bag.
dark white bags contain 2 drab crimson bags, 5 dull gray bags.
faded blue bags contain 1 faded olive bag, 2 shiny magenta bags, 5 dark plum bags.
posh tan bags contain 2 posh plum bags, 5 muted black bags, 3 clear indigo bags, 4 striped gold bags.
striped silver bags contain 4 drab tomato bags.
muted lavender bags contain 3 dim silver bags, 2 wavy lavender bags, 1 faded tan bag.
wavy chartreuse bags contain 5 dull bronze bags.
dark blue bags contain 1 dotted silver bag, 3 light yellow bags, 3 mirrored bronze bags, 4 shiny lavender bags.
dim turquoise bags contain 3 pale green bags, 4 mirrored gray bags.
muted blue bags contain 1 striped lavender bag, 3 dark fuchsia bags.
faded brown bags contain 2 dotted violet bags, 5 faded indigo bags, 5 drab indigo bags.
shiny magenta bags contain 5 dotted turquoise bags, 3 plaid violet bags, 2 dim cyan bags.
clear chartreuse bags contain 3 pale maroon bags, 5 plaid blue bags, 1 clear tan bag.
faded turquoise bags contain 4 mirrored magenta bags.
posh turquoise bags contain 3 dotted yellow bags, 5 striped purple bags, 3 pale cyan bags.
vibrant tomato bags contain 4 dark cyan bags.
mirrored white bags contain 2 mirrored indigo bags, 3 dim cyan bags, 3 bright lavender bags.
dull purple bags contain 2 striped yellow bags, 3 dull plum bags, 3 shiny gold bags, 3 pale gold bags.
mirrored yellow bags contain 4 shiny crimson bags.
posh white bags contain 3 mirrored orange bags.
wavy fuchsia bags contain 3 dotted tan bags, 5 shiny coral bags.
mirrored green bags contain 1 dull white bag, 5 shiny crimson bags.
plaid turquoise bags contain 2 pale salmon bags, 4 dull beige bags.
clear cyan bags contain 1 dim silver bag, 4 drab chartreuse bags.
mirrored purple bags contain 1 dull coral bag, 3 vibrant plum bags.
dim lavender bags contain 1 striped black bag, 4 shiny red bags, 4 posh chartreuse bags, 2 dim teal bags.
plaid cyan bags contain 1 dim orange bag.
plaid magenta bags contain 5 striped red bags, 4 striped salmon bags.
shiny blue bags contain 2 shiny turquoise bags, 1 posh orange bag.
faded aqua bags contain 3 light yellow bags, 3 wavy purple bags, 5 dull lime bags, 5 dotted black bags.
mirrored blue bags contain 5 wavy silver bags.
posh indigo bags contain 5 dark tan bags, 2 vibrant blue bags, 5 dark bronze bags, 2 vibrant crimson bags.
clear plum bags contain 1 wavy teal bag, 1 faded yellow bag.
dark gray bags contain 4 bright lavender bags.
muted coral bags contain 4 shiny red bags, 2 pale teal bags, 4 dim olive bags, 3 muted silver bags.
dim gold bags contain 2 pale gold bags, 3 vibrant red bags.
plaid violet bags contain 3 faded green bags, 4 mirrored teal bags, 1 wavy purple bag, 1 faded yellow bag.
clear tomato bags contain 2 drab beige bags, 3 dim cyan bags.
bright beige bags contain 5 muted brown bags, 4 wavy red bags, 4 clear maroon bags.
wavy teal bags contain 4 muted beige bags, 1 posh salmon bag, 2 posh black bags, 2 dotted maroon bags.
vibrant salmon bags contain 4 vibrant purple bags, 4 dull chartreuse bags.
dull coral bags contain 2 light red bags, 3 dark plum bags, 3 bright gray bags, 1 dotted cyan bag.
bright turquoise bags contain 4 plaid teal bags, 3 muted orange bags.
wavy maroon bags contain 5 pale fuchsia bags, 5 dotted magenta bags.
plaid gold bags contain 2 shiny lavender bags, 1 vibrant gray bag, 5 mirrored teal bags.
wavy black bags contain 1 wavy magenta bag.
drab beige bags contain 1 mirrored chartreuse bag, 3 wavy brown bags, 4 pale beige bags, 2 pale turquoise bags.
posh blue bags contain 4 clear silver bags.
vibrant turquoise bags contain 1 posh white bag, 2 bright gold bags.
faded black bags contain 5 wavy black bags, 1 shiny crimson bag.
pale salmon bags contain 1 vibrant brown bag.
striped gray bags contain 1 mirrored violet bag, 4 dull violet bags, 4 muted turquoise bags.
light brown bags contain 5 muted crimson bags, 1 drab crimson bag, 4 muted aqua bags, 5 dotted blue bags.
striped turquoise bags contain 5 muted blue bags, 4 mirrored salmon bags.
shiny lime bags contain 1 vibrant purple bag, 4 pale turquoise bags, 4 drab tomato bags, 4 dotted maroon bags.
dotted white bags contain 5 pale violet bags, 1 posh plum bag, 1 shiny chartreuse bag, 2 faded bronze bags.
dotted crimson bags contain 2 shiny olive bags, 2 mirrored yellow bags.
mirrored teal bags contain 1 dull violet bag, 4 shiny red bags, 3 drab black bags, 1 posh magenta bag.
striped lavender bags contain 4 light crimson bags.
pale chartreuse bags contain 1 wavy red bag.
posh gray bags contain 3 posh black bags.
clear teal bags contain 4 dull violet bags, 4 dotted chartreuse bags, 3 drab tan bags.
light olive bags contain 3 muted olive bags, 4 plaid turquoise bags.
light tomato bags contain 5 dull chartreuse bags, 3 muted beige bags.
light orange bags contain 2 wavy lavender bags.
wavy coral bags contain 5 drab beige bags, 4 plaid white bags.
dotted violet bags contain 5 muted salmon bags, 5 shiny red bags, 3 shiny crimson bags.
muted fuchsia bags contain 5 dull coral bags.
pale turquoise bags contain 3 vibrant red bags.
faded beige bags contain 2 striped magenta bags.
dull tan bags contain 3 drab maroon bags, 3 muted beige bags.
posh lime bags contain 4 wavy turquoise bags, 2 light blue bags, 1 posh salmon bag.
drab magenta bags contain 5 dim magenta bags.
striped crimson bags contain 1 dull white bag, 4 muted plum bags, 1 posh chartreuse bag.
vibrant maroon bags contain 4 pale aqua bags.
dotted black bags contain 5 shiny bronze bags, 1 shiny lime bag, 5 dotted yellow bags, 1 wavy turquoise bag.
wavy aqua bags contain 3 dull tomato bags, 1 shiny olive bag, 4 vibrant brown bags, 2 dim chartreuse bags.
dim tan bags contain 2 bright plum bags, 4 striped gold bags, 4 dull coral bags.
dull fuchsia bags contain 5 wavy maroon bags.
striped red bags contain 5 shiny red bags, 4 clear gold bags, 4 posh magenta bags, 2 bright yellow bags.
dotted lavender bags contain 3 faded lavender bags.
muted turquoise bags contain 4 faded fuchsia bags.
bright gray bags contain 2 light silver bags, 3 dull violet bags.
dull indigo bags contain 2 dim violet bags, 3 plaid salmon bags, 5 plaid beige bags.
wavy purple bags contain 3 dim yellow bags, 1 posh salmon bag.
wavy lime bags contain 2 dark fuchsia bags, 3 dark salmon bags, 5 bright silver bags, 5 pale aqua bags.
light cyan bags contain 2 clear blue bags.
light beige bags contain 5 dull red bags, 3 dark violet bags, 5 shiny lime bags.
mirrored silver bags contain 1 plaid beige bag, 5 dull coral bags.
dark beige bags contain 1 clear tan bag, 4 wavy orange bags, 3 shiny cyan bags, 5 shiny magenta bags.
vibrant crimson bags contain 2 mirrored teal bags, 3 pale turquoise bags, 5 posh magenta bags.
faded red bags contain 3 plaid lime bags, 2 clear brown bags.
dim bronze bags contain 2 dark beige bags, 1 plaid cyan bag, 3 clear purple bags.
bright maroon bags contain 3 light gray bags, 2 faded turquoise bags, 1 posh cyan bag.
clear gray bags contain 4 faded green bags.
pale silver bags contain 3 dull magenta bags.
dotted red bags contain 2 clear purple bags, 1 faded crimson bag, 5 dull bronze bags, 5 muted plum bags.
striped maroon bags contain 5 mirrored cyan bags, 3 dark green bags, 4 clear indigo bags, 2 muted beige bags.
dark cyan bags contain 3 dotted maroon bags, 2 vibrant red bags.
clear bronze bags contain 1 drab lime bag, 5 light gold bags.
dull yellow bags contain 1 dull chartreuse bag, 1 muted olive bag.
plaid lavender bags contain 1 vibrant silver bag, 5 clear fuchsia bags.
posh black bags contain 5 dotted salmon bags, 4 drab tomato bags, 5 drab black bags.
faded lime bags contain 1 dark silver bag.
clear lavender bags contain 5 light violet bags.
dotted gray bags contain 4 clear lavender bags, 3 shiny magenta bags.
shiny gray bags contain 5 dull brown bags.
drab coral bags contain 2 faded beige bags.
dark teal bags contain 3 drab indigo bags, 2 light aqua bags, 1 faded tan bag, 2 wavy brown bags.
shiny violet bags contain 1 posh black bag, 5 dim beige bags.
clear salmon bags contain 5 clear orange bags.
shiny olive bags contain 2 shiny yellow bags, 1 shiny indigo bag, 4 bright yellow bags.
plaid salmon bags contain 4 striped yellow bags, 4 mirrored chartreuse bags, 3 light magenta bags, 2 mirrored magenta bags.
wavy orange bags contain 5 vibrant purple bags.
posh magenta bags contain 3 mirrored chartreuse bags, 4 vibrant red bags.
pale fuchsia bags contain 5 muted silver bags.
light black bags contain 5 wavy orange bags, 5 faded tomato bags.
light gold bags contain 1 dull red bag.
bright brown bags contain 5 mirrored beige bags, 5 faded indigo bags.
muted teal bags contain 5 posh magenta bags, 1 dim gray bag, 3 pale plum bags.
pale plum bags contain 2 muted beige bags, 2 posh magenta bags, 2 shiny gold bags.
drab gold bags contain 1 striped beige bag.
posh gold bags contain 3 shiny silver bags.
dull turquoise bags contain 4 vibrant crimson bags, 3 faded gray bags, 5 muted purple bags.
light chartreuse bags contain 2 bright lavender bags, 4 bright silver bags.
striped chartreuse bags contain 1 shiny coral bag, 2 clear blue bags, 2 dotted turquoise bags.
dark aqua bags contain 3 wavy bronze bags, 4 shiny brown bags, 2 bright violet bags, 1 dotted indigo bag.
muted bronze bags contain 3 pale salmon bags, 1 striped teal bag.
dark violet bags contain 2 wavy magenta bags.
dark maroon bags contain 2 muted red bags.
shiny silver bags contain 2 light gray bags, 1 pale aqua bag, 5 dim tomato bags.
bright lavender bags contain 5 striped red bags, 3 faded tan bags.
dim olive bags contain 3 posh cyan bags, 4 light aqua bags, 1 wavy tan bag, 3 dull silver bags.
posh beige bags contain 5 faded tan bags, 1 shiny lime bag, 4 wavy lavender bags.
muted maroon bags contain 3 mirrored purple bags, 2 mirrored gold bags, 1 clear tan bag.
vibrant yellow bags contain 4 light lavender bags.
light purple bags contain 1 faded olive bag, 1 wavy red bag.
bright yellow bags contain 3 dotted salmon bags, 4 posh magenta bags, 4 striped salmon bags.
dull gray bags contain 5 posh magenta bags, 1 shiny white bag, 2 dim bronze bags, 2 dim lavender bags.
vibrant plum bags contain 1 faded tan bag, 2 pale turquoise bags, 4 bright chartreuse bags, 4 dull violet bags.
posh chartreuse bags contain 1 bright chartreuse bag, 4 drab black bags, 2 posh magenta bags, 4 dark orange bags.
drab gray bags contain 4 plaid turquoise bags.
dark brown bags contain 4 dotted green bags, 3 dim lavender bags.
mirrored crimson bags contain 2 light teal bags, 2 plaid blue bags, 5 wavy red bags, 2 bright tomato bags.
dotted gold bags contain 4 bright olive bags.
dark salmon bags contain 3 pale turquoise bags, 5 faded tan bags, 1 mirrored chartreuse bag.
wavy gray bags contain 4 shiny green bags, 5 shiny red bags.
dotted blue bags contain 2 wavy yellow bags, 1 dull beige bag.
dim maroon bags contain 2 wavy maroon bags, 5 dim violet bags, 4 dark tan bags.
plaid purple bags contain 2 dark teal bags, 2 mirrored black bags, 1 wavy lavender bag.
dull blue bags contain 1 bright gold bag, 2 dim olive bags, 4 muted chartreuse bags, 2 striped salmon bags.
muted white bags contain 4 light bronze bags, 3 wavy beige bags.
muted gold bags contain no other bags.
drab green bags contain 2 plaid chartreuse bags.
clear coral bags contain 5 mirrored cyan bags.
drab turquoise bags contain 3 posh black bags.
dotted fuchsia bags contain 2 light red bags, 4 clear aqua bags, 1 posh magenta bag, 4 vibrant cyan bags.
clear lime bags contain 3 dark chartreuse bags.
mirrored plum bags contain 1 wavy tan bag, 2 bright olive bags.
vibrant coral bags contain 3 light gray bags, 5 light white bags.
pale bronze bags contain 2 bright silver bags, 5 vibrant tan bags, 4 posh lime bags, 3 wavy silver bags.
plaid blue bags contain 4 dotted beige bags, 2 wavy olive bags, 2 striped tomato bags.
shiny teal bags contain 2 shiny violet bags, 1 faded blue bag, 5 shiny white bags, 4 dim fuchsia bags.
clear black bags contain 4 faded purple bags, 1 dim tomato bag, 5 striped brown bags, 2 faded indigo bags.
clear orange bags contain 2 bright gold bags, 5 light crimson bags, 2 faded yellow bags.
drab maroon bags contain 1 vibrant red bag, 2 dotted bronze bags.
drab blue bags contain 1 mirrored aqua bag, 1 dark gold bag, 3 shiny crimson bags.
striped black bags contain 2 drab black bags, 5 dark orange bags.
light lavender bags contain 1 clear blue bag, 1 striped red bag.
posh bronze bags contain 5 light red bags, 4 dull plum bags, 1 dim coral bag, 3 clear blue bags.
plaid beige bags contain 5 dotted turquoise bags, 2 light cyan bags.
plaid fuchsia bags contain 3 wavy fuchsia bags.
shiny bronze bags contain 5 vibrant silver bags, 3 striped silver bags, 3 pale turquoise bags, 2 faded olive bags.
vibrant purple bags contain 3 wavy magenta bags.
pale magenta bags contain 4 dim yellow bags, 1 dim aqua bag.
faded purple bags contain 5 mirrored black bags, 1 muted beige bag, 1 muted aqua bag, 1 light maroon bag.
light turquoise bags contain 5 muted brown bags, 1 posh beige bag, 2 vibrant fuchsia bags, 3 faded teal bags.
vibrant lavender bags contain 1 light chartreuse bag, 3 mirrored teal bags, 5 drab lavender bags, 4 shiny brown bags.
striped yellow bags contain 1 dotted cyan bag, 3 mirrored turquoise bags.
drab bronze bags contain 3 shiny lavender bags, 5 muted yellow bags, 3 plaid teal bags, 2 plaid gold bags.
posh maroon bags contain 5 bright fuchsia bags, 3 dotted indigo bags, 5 dark teal bags, 1 faded violet bag.
vibrant cyan bags contain 2 dark orange bags.
striped aqua bags contain 2 light bronze bags, 1 dull beige bag, 4 pale violet bags, 5 pale beige bags.
faded gold bags contain 4 pale crimson bags.
muted olive bags contain 2 mirrored teal bags, 1 dim aqua bag, 3 posh chartreuse bags, 3 dull brown bags.
dim coral bags contain 1 mirrored gold bag.
dull silver bags contain 5 faded gray bags, 5 light red bags, 3 light crimson bags, 4 bright chartreuse bags.
vibrant gray bags contain 2 plaid silver bags, 5 plaid violet bags, 1 dim silver bag, 4 mirrored chartreuse bags.
plaid crimson bags contain 2 vibrant bronze bags, 1 drab olive bag, 1 pale purple bag.
dotted maroon bags contain no other bags.
vibrant brown bags contain 2 dull violet bags, 4 muted beige bags, 4 wavy teal bags.
bright tomato bags contain 3 muted beige bags.
shiny cyan bags contain 5 clear gold bags, 2 shiny lime bags, 4 wavy magenta bags, 2 wavy lavender bags.
drab tan bags contain 1 plaid red bag.
dull plum bags contain 4 dotted magenta bags, 1 plaid silver bag, 1 pale teal bag, 1 dim yellow bag.
clear gold bags contain 1 bright gold bag, 4 dark orange bags, 4 posh magenta bags.
shiny gold bags contain 5 dark salmon bags, 2 wavy purple bags, 5 dark cyan bags, 5 dull chartreuse bags.
mirrored tomato bags contain 3 light aqua bags, 4 pale plum bags, 1 pale beige bag.
dim tomato bags contain 5 light crimson bags, 2 bright lavender bags.
mirrored tan bags contain 1 vibrant plum bag, 2 faded violet bags, 5 striped lime bags, 3 muted white bags.
faded teal bags contain 1 drab silver bag.
dim red bags contain 2 clear turquoise bags, 3 drab maroon bags.
dark magenta bags contain 2 clear cyan bags.
vibrant gold bags contain 4 dotted salmon bags, 3 bright chartreuse bags, 3 striped purple bags.
muted brown bags contain 4 posh beige bags, 3 muted aqua bags, 5 dim beige bags, 4 dim magenta bags.
plaid orange bags contain 2 dark purple bags, 4 mirrored tomato bags, 1 vibrant orange bag.
pale gold bags contain 1 vibrant plum bag, 4 dotted violet bags.
plaid gray bags contain 3 bright silver bags, 5 drab fuchsia bags.
muted orange bags contain 5 dull magenta bags, 5 clear lavender bags, 4 mirrored chartreuse bags, 4 vibrant silver bags.
muted aqua bags contain 2 dim silver bags, 2 wavy black bags.
dim crimson bags contain 2 mirrored bronze bags, 4 muted cyan bags.
dark tomato bags contain 5 pale blue bags.
bright salmon bags contain 1 vibrant tan bag, 4 bright white bags, 1 dim gray bag.
mirrored orange bags contain 1 dark salmon bag, 5 drab beige bags, 5 dull chartreuse bags, 1 shiny cyan bag.
clear aqua bags contain 2 dim teal bags, 4 wavy olive bags.
bright bronze bags contain 3 shiny maroon bags.
vibrant black bags contain 3 muted gold bags, 2 striped red bags, 2 pale magenta bags, 4 clear violet bags.
clear yellow bags contain 2 plaid maroon bags.
pale lavender bags contain 1 shiny maroon bag, 5 bright cyan bags, 5 shiny orange bags, 4 striped tomato bags.
dark chartreuse bags contain 2 wavy brown bags.
mirrored violet bags contain 2 light lavender bags, 4 dull coral bags, 2 light red bags.
vibrant beige bags contain 2 shiny red bags, 2 clear tan bags.
mirrored coral bags contain 4 faded coral bags, 2 dull bronze bags.
posh red bags contain 4 wavy brown bags, 1 dark salmon bag, 5 dull chartreuse bags, 5 vibrant crimson bags.
light green bags contain 4 posh fuchsia bags.
wavy green bags contain 3 dark green bags, 4 posh chartreuse bags, 1 mirrored black bag.
drab violet bags contain 5 wavy yellow bags.
dark crimson bags contain 1 bright gray bag, 2 shiny violet bags, 3 pale chartreuse bags.
posh green bags contain 2 bright yellow bags, 2 faded yellow bags.
shiny plum bags contain 3 shiny indigo bags, 1 dark gold bag, 2 dim coral bags.
striped beige bags contain 2 muted beige bags.
dark orange bags contain 5 bright gold bags, 2 dotted maroon bags, 1 striped salmon bag, 3 vibrant red bags.
bright orange bags contain 4 muted blue bags, 5 striped blue bags, 4 dark cyan bags.
dark black bags contain 1 shiny lime bag, 1 clear olive bag, 4 dull bronze bags, 3 muted lavender bags.
pale orange bags contain 3 plaid violet bags, 1 shiny red bag, 1 dull coral bag, 1 shiny bronze bag.
mirrored salmon bags contain 4 vibrant red bags, 3 muted beige bags, 2 dark orange bags.
drab yellow bags contain 1 bright white bag.
dull tomato bags contain 4 muted beige bags, 3 posh salmon bags, 2 shiny maroon bags.
striped fuchsia bags contain 5 pale beige bags, 3 mirrored gray bags.
mirrored beige bags contain 5 mirrored black bags, 2 dim lavender bags, 1 clear lime bag.
wavy tomato bags contain 4 wavy fuchsia bags.
bright indigo bags contain 2 dull violet bags, 5 dull green bags, 3 dotted cyan bags, 2 dotted tan bags.
striped blue bags contain 1 posh red bag, 4 bright fuchsia bags, 4 dark aqua bags.
bright green bags contain 3 dim violet bags, 2 shiny coral bags, 1 dim white bag, 4 dim yellow bags.
dotted salmon bags contain 5 dull red bags, 2 striped salmon bags, 5 dotted maroon bags, 3 shiny red bags.
light magenta bags contain 1 dark fuchsia bag, 1 pale turquoise bag, 5 pale plum bags, 3 vibrant tan bags.
mirrored olive bags contain 1 shiny lavender bag.
dark coral bags contain 3 wavy teal bags, 4 muted plum bags.
posh teal bags contain 1 pale violet bag, 5 muted tan bags, 1 drab gray bag, 2 drab beige bags.
bright teal bags contain 5 mirrored coral bags.
striped orange bags contain 3 clear olive bags.
faded plum bags contain 5 striped black bags, 1 striped gold bag.
plaid tomato bags contain 1 muted salmon bag, 2 pale violet bags, 1 light violet bag, 3 dim tomato bags.
dim blue bags contain 4 drab salmon bags, 4 faded plum bags, 1 light salmon bag, 3 dark turquoise bags.
striped coral bags contain 3 wavy fuchsia bags.
light violet bags contain 4 dim beige bags, 4 striped lavender bags, 1 dotted orange bag, 1 wavy purple bag.
dull white bags contain 2 faded purple bags, 1 bright silver bag, 4 pale bronze bags, 3 clear fuchsia bags.
dim white bags contain 2 light yellow bags, 5 posh gold bags, 1 bright blue bag, 1 striped chartreuse bag.
bright chartreuse bags contain 1 muted gold bag, 1 dotted maroon bag.
striped purple bags contain 2 light orange bags, 1 dotted maroon bag, 3 dim magenta bags, 4 plaid violet bags.
dotted tomato bags contain 5 posh chartreuse bags.
wavy lavender bags contain 4 dim yellow bags, 4 pale turquoise bags, 4 vibrant red bags, 3 bright yellow bags.
striped teal bags contain 2 bright yellow bags.
drab crimson bags contain 1 wavy tan bag, 1 dull green bag, 3 muted blue bags.
dull lime bags contain 3 shiny tomato bags.
posh salmon bags contain no other bags.
vibrant aqua bags contain 2 shiny indigo bags, 3 shiny crimson bags, 4 shiny cyan bags.
drab black bags contain 3 dull violet bags, 4 dotted maroon bags, 3 vibrant purple bags, 3 muted plum bags.
drab olive bags contain 5 drab orange bags, 4 dotted green bags, 5 drab chartreuse bags.
dark plum bags contain 2 dotted salmon bags, 5 wavy magenta bags, 1 bright chartreuse bag.
plaid brown bags contain 2 light lavender bags.
striped magenta bags contain 5 pale lime bags, 4 posh salmon bags, 5 clear tomato bags, 5 dull plum bags.
dull orange bags contain 4 light maroon bags.
vibrant orange bags contain 5 dull red bags, 1 posh chartreuse bag.
mirrored turquoise bags contain 4 drab cyan bags, 1 posh cyan bag, 4 clear gold bags, 5 plaid magenta bags.
mirrored black bags contain no other bags.
shiny black bags contain 5 dotted green bags, 1 dim violet bag, 1 clear cyan bag, 2 muted fuchsia bags.
vibrant indigo bags contain 1 light maroon bag.
bright fuchsia bags contain 5 faded olive bags.
dotted plum bags contain 5 shiny violet bags.
plaid lime bags contain 2 bright gray bags, 4 pale beige bags, 4 light silver bags.
plaid red bags contain 1 shiny maroon bag, 4 striped lavender bags, 5 mirrored purple bags.
mirrored lime bags contain 5 faded coral bags, 3 dark gold bags, 5 mirrored indigo bags, 5 dull coral bags.
drab lime bags contain 2 dotted aqua bags, 5 shiny chartreuse bags.
faded tan bags contain 1 muted plum bag, 1 posh salmon bag.
dark silver bags contain 4 dotted maroon bags, 4 shiny white bags.
striped indigo bags contain 5 dull plum bags, 2 light lavender bags, 3 light red bags, 1 muted olive bag.
bright gold bags contain no other bags.
plaid black bags contain 2 dull violet bags, 5 muted olive bags, 1 muted teal bag.
dotted chartreuse bags contain no other bags.
vibrant blue bags contain 1 shiny cyan bag.
dim indigo bags contain 1 bright purple bag, 1 plaid magenta bag, 5 posh fuchsia bags, 5 plaid red bags.
light red bags contain 5 bright gold bags, 4 plaid silver bags, 1 dull violet bag, 4 pale turquoise bags.
dim black bags contain 3 dim orange bags, 5 dull lime bags, 2 faded indigo bags, 3 dotted olive bags.
mirrored gold bags contain 2 muted gold bags, 5 dark cyan bags.
posh aqua bags contain 1 clear violet bag.
light blue bags contain 3 drab chartreuse bags, 2 dull chartreuse bags.
shiny maroon bags contain 1 wavy violet bag.
faded lavender bags contain 1 dark salmon bag, 5 vibrant orange bags, 3 vibrant purple bags, 5 posh black bags.
faded olive bags contain 2 mirrored teal bags, 5 pale plum bags, 4 pale brown bags.
drab indigo bags contain 1 dim cyan bag, 1 plaid silver bag.
clear white bags contain 4 posh beige bags.
wavy violet bags contain 5 dotted fuchsia bags.
dark turquoise bags contain 5 vibrant turquoise bags, 3 vibrant lavender bags.
striped violet bags contain 5 mirrored turquoise bags, 1 muted orange bag, 3 dim teal bags, 4 posh green bags.
wavy yellow bags contain 2 dim yellow bags, 5 dim lavender bags.
dark red bags contain 4 striped gold bags, 3 vibrant tomato bags.
plaid maroon bags contain 5 light white bags, 5 plaid black bags.
bright black bags contain 3 light maroon bags, 5 shiny lime bags, 2 vibrant maroon bags, 3 clear violet bags.
drab salmon bags contain 2 clear coral bags, 4 dark indigo bags.
plaid green bags contain 2 pale indigo bags.
pale teal bags contain 4 drab black bags, 3 faded gray bags, 5 posh beige bags, 4 faded yellow bags.
light silver bags contain 5 bright yellow bags, 1 dim silver bag, 5 posh chartreuse bags.
dull magenta bags contain 3 posh turquoise bags, 3 light magenta bags, 4 shiny orange bags, 4 clear turquoise bags.
pale white bags contain 5 dark cyan bags.
dull chartreuse bags contain 3 mirrored black bags, 3 dotted salmon bags, 5 pale turquoise bags.
dim salmon bags contain 2 mirrored yellow bags, 5 striped salmon bags, 1 drab tomato bag, 5 dull yellow bags.
shiny crimson bags contain 5 faded tan bags, 2 muted salmon bags, 1 wavy teal bag, 3 vibrant orange bags.
dark purple bags contain 2 muted plum bags, 5 bright lavender bags, 1 dark cyan bag, 4 clear orange bags.
clear brown bags contain 2 dim orange bags, 1 vibrant maroon bag, 2 striped lime bags.
muted silver bags contain 5 vibrant gray bags.
vibrant bronze bags contain 3 posh red bags.
mirrored maroon bags contain 3 clear magenta bags, 2 posh brown bags, 5 wavy teal bags.
muted tomato bags contain 5 faded aqua bags, 4 wavy lavender bags, 1 mirrored silver bag.
posh olive bags contain 4 faded salmon bags, 1 muted green bag, 5 light tomato bags, 3 dark gold bags.
dotted turquoise bags contain 5 light orange bags, 1 dull brown bag.
light bronze bags contain 2 pale cyan bags, 3 shiny lime bags, 2 faded olive bags.
striped gold bags contain 4 muted salmon bags, 1 bright yellow bag, 1 dark plum bag, 4 light maroon bags.
faded maroon bags contain 5 wavy silver bags, 3 plaid magenta bags.
clear magenta bags contain 2 wavy turquoise bags.
vibrant olive bags contain 1 muted silver bag.
clear tan bags contain 4 mirrored gold bags.
posh orange bags contain 3 plaid blue bags, 4 dotted aqua bags.
wavy cyan bags contain 3 posh lavender bags.
shiny chartreuse bags contain 5 mirrored cyan bags, 3 posh chartreuse bags, 4 dotted aqua bags.
light lime bags contain 5 muted plum bags, 2 wavy purple bags.
wavy silver bags contain 4 faded lavender bags.
drab red bags contain 4 clear tomato bags, 4 pale turquoise bags, 2 dull yellow bags.
light aqua bags contain 3 dotted aqua bags.
dim purple bags contain 2 striped gold bags, 2 drab tan bags, 2 mirrored tan bags.
shiny indigo bags contain 1 pale magenta bag, 5 dim plum bags, 3 muted blue bags, 4 dim coral bags.
pale lime bags contain 2 mirrored cyan bags, 4 dull violet bags, 1 striped lime bag.
posh lavender bags contain 5 clear purple bags, 2 muted gold bags, 5 dull brown bags, 4 muted lime bags.
dull lavender bags contain 1 striped violet bag, 3 muted bronze bags.
dotted lime bags contain 3 plaid magenta bags, 5 plaid violet bags, 1 shiny lime bag, 3 plaid purple bags.
posh coral bags contain 5 mirrored violet bags, 1 clear violet bag, 1 dark fuchsia bag, 3 dotted silver bags.
bright plum bags contain 5 wavy brown bags.
pale coral bags contain 3 bright olive bags.
dim fuchsia bags contain 2 bright chartreuse bags, 4 mirrored teal bags, 4 posh salmon bags, 3 light chartreuse bags.
dim cyan bags contain 2 faded tan bags, 4 mirrored gold bags.
faded cyan bags contain 1 dotted black bag, 1 shiny maroon bag, 2 muted chartreuse bags.
        """.trimIndent()
    }
}

/**
 * DAY 7 PROBLEM 2
 */
object InputDay7Problem2 : Inputs() {
    override fun getInput(): String {
        return """
dark olive bags contain 2 muted brown bags, 1 mirrored tomato bag, 4 bright black bags.
faded coral bags contain 3 drab cyan bags, 1 light aqua bag.
plaid plum bags contain 2 mirrored cyan bags.
clear maroon bags contain 1 dotted turquoise bag, 3 dim lavender bags.
plaid coral bags contain 3 posh fuchsia bags, 3 dotted beige bags, 2 wavy turquoise bags.
mirrored indigo bags contain 5 pale orange bags, 5 striped aqua bags, 1 dotted cyan bag, 4 muted coral bags.
striped brown bags contain 4 faded green bags, 5 vibrant red bags, 3 drab black bags, 3 dark orange bags.
drab fuchsia bags contain 5 shiny chartreuse bags, 1 dark orange bag, 4 drab blue bags, 1 bright chartreuse bag.
light fuchsia bags contain 3 bright gold bags, 5 clear indigo bags.
plaid olive bags contain 4 striped indigo bags, 4 muted olive bags, 2 light gray bags, 2 wavy purple bags.
dotted green bags contain 2 faded yellow bags.
dotted cyan bags contain 1 light red bag, 5 dark cyan bags.
muted magenta bags contain 2 clear plum bags.
mirrored cyan bags contain 4 bright lavender bags, 3 mirrored gold bags, 2 plaid silver bags, 1 posh chartreuse bag.
muted red bags contain 2 wavy olive bags, 4 shiny cyan bags.
clear indigo bags contain 2 dotted magenta bags, 4 bright silver bags, 4 muted aqua bags.
plaid chartreuse bags contain 3 dark chartreuse bags, 1 faded lavender bag.
wavy tan bags contain 3 light red bags.
bright crimson bags contain 4 pale magenta bags.
pale yellow bags contain 3 clear plum bags, 2 vibrant cyan bags, 2 muted white bags.
pale tomato bags contain 2 muted red bags.
dull salmon bags contain 3 dark gold bags.
light white bags contain 2 drab chartreuse bags.
drab plum bags contain 1 dark brown bag.
shiny purple bags contain 3 pale brown bags, 1 bright crimson bag, 5 muted teal bags.
pale red bags contain 5 posh cyan bags, 2 drab cyan bags.
dull bronze bags contain 2 striped indigo bags, 4 plaid black bags, 3 clear violet bags, 1 dull chartreuse bag.
wavy indigo bags contain 2 dull coral bags, 1 dark tan bag.
vibrant silver bags contain 5 muted aqua bags.
shiny tan bags contain 4 pale beige bags, 4 bright gold bags, 5 muted coral bags, 3 shiny red bags.
dim yellow bags contain 1 dotted chartreuse bag.
faded white bags contain 5 posh lavender bags, 3 bright silver bags, 2 dark green bags, 5 muted lavender bags.
shiny tomato bags contain 4 mirrored chartreuse bags, 2 bright yellow bags, 4 vibrant plum bags.
dark yellow bags contain 3 plaid lime bags, 4 wavy lavender bags.
dim magenta bags contain 3 wavy violet bags.
striped white bags contain 5 striped chartreuse bags.
muted gray bags contain 5 muted brown bags, 5 light lavender bags, 2 clear gold bags, 1 shiny green bag.
drab white bags contain 4 muted yellow bags, 3 posh lavender bags, 3 faded fuchsia bags.
dark lime bags contain 1 bright crimson bag.
muted salmon bags contain 4 dull red bags, 1 dull violet bag.
muted black bags contain 2 vibrant black bags, 5 pale tomato bags.
plaid white bags contain 4 drab black bags, 4 drab cyan bags, 1 dim olive bag.
clear green bags contain 3 wavy purple bags, 1 pale gold bag.
drab orange bags contain 4 clear maroon bags, 3 vibrant gold bags.
light salmon bags contain 1 pale black bag, 2 posh fuchsia bags.
faded tomato bags contain 5 faded black bags, 3 vibrant coral bags, 3 bright brown bags.
dull green bags contain 5 clear lime bags.
dim orange bags contain 5 posh red bags, 2 dim gray bags, 2 muted gold bags.
dotted orange bags contain 1 faded tan bag, 2 drab tomato bags.
dull gold bags contain 5 muted gold bags.
clear beige bags contain 5 plaid tan bags, 4 dim maroon bags.
mirrored bronze bags contain 1 clear blue bag, 2 clear tan bags, 3 clear orange bags.
shiny brown bags contain 5 light tomato bags.
pale cyan bags contain 3 dull silver bags.
muted purple bags contain 4 posh brown bags.
pale maroon bags contain 1 clear maroon bag, 5 vibrant yellow bags, 1 shiny violet bag.
muted green bags contain 5 plaid plum bags.
light coral bags contain 5 bright lime bags, 1 dotted indigo bag, 5 shiny bronze bags.
wavy beige bags contain 5 light magenta bags, 3 pale lime bags, 1 faded yellow bag.
wavy turquoise bags contain 5 shiny red bags, 3 mirrored yellow bags, 2 posh bronze bags.
pale brown bags contain 2 striped salmon bags, 4 vibrant plum bags, 2 dull silver bags.
striped bronze bags contain 3 posh black bags, 2 bright yellow bags, 3 dotted silver bags, 1 mirrored violet bag.
pale tan bags contain 4 shiny lavender bags, 3 dotted turquoise bags, 3 pale turquoise bags, 5 plaid white bags.
muted crimson bags contain 4 dull lime bags, 4 pale magenta bags, 2 light cyan bags.
dotted purple bags contain 2 wavy magenta bags.
dull black bags contain 3 light crimson bags, 3 mirrored fuchsia bags, 3 posh lime bags.
mirrored aqua bags contain 1 dark brown bag, 5 pale gold bags, 2 pale purple bags, 2 vibrant crimson bags.
shiny beige bags contain 2 muted indigo bags, 2 dark tan bags.
shiny aqua bags contain 5 vibrant tan bags, 2 pale tomato bags, 2 faded blue bags, 4 pale magenta bags.
mirrored lavender bags contain 4 faded yellow bags, 3 light chartreuse bags, 2 dull crimson bags, 1 pale aqua bag.
faded gray bags contain 5 bright yellow bags, 4 light silver bags.
light tan bags contain 3 bright fuchsia bags, 3 light crimson bags, 3 clear olive bags, 1 clear silver bag.
dull crimson bags contain 3 wavy olive bags, 1 light maroon bag.
pale olive bags contain 4 vibrant purple bags, 3 clear fuchsia bags, 2 pale tan bags.
dim beige bags contain 3 dull silver bags.
dark bronze bags contain 1 mirrored orange bag, 2 wavy crimson bags, 1 dark maroon bag.
mirrored fuchsia bags contain 1 dark chartreuse bag, 1 dotted bronze bag, 5 shiny silver bags.
striped tomato bags contain 1 dark fuchsia bag, 5 vibrant maroon bags, 4 drab crimson bags.
muted chartreuse bags contain 1 light tomato bag, 3 light magenta bags, 3 dull beige bags.
muted violet bags contain 5 light tomato bags.
dim violet bags contain 2 mirrored purple bags, 3 bright black bags, 5 vibrant plum bags.
muted beige bags contain 4 muted plum bags, 4 mirrored gold bags, 5 bright yellow bags.
shiny coral bags contain 5 vibrant gray bags, 1 light bronze bag, 5 faded chartreuse bags, 2 plaid violet bags.
dotted yellow bags contain 5 dotted turquoise bags.
faded bronze bags contain 4 dull purple bags, 2 pale fuchsia bags.
clear fuchsia bags contain 5 bright yellow bags.
dotted beige bags contain 1 pale turquoise bag.
bright aqua bags contain 2 faded silver bags, 5 dim fuchsia bags.
dim silver bags contain 5 wavy brown bags, 1 light maroon bag, 2 wavy black bags.
plaid tan bags contain 3 dotted green bags.
drab teal bags contain 4 mirrored violet bags, 5 dotted bronze bags, 1 pale cyan bag.
plaid yellow bags contain 5 shiny magenta bags, 1 dark silver bag, 5 shiny indigo bags, 3 faded gray bags.
dull cyan bags contain 1 posh plum bag, 5 dim coral bags.
pale beige bags contain 3 dark cyan bags, 4 faded tan bags, 2 plaid silver bags.
faded salmon bags contain 2 light olive bags, 2 dark tan bags.
bright silver bags contain 1 clear fuchsia bag, 2 clear lime bags.
dark lavender bags contain 1 pale cyan bag, 5 dotted salmon bags, 1 striped turquoise bag, 2 dim crimson bags.
light gray bags contain 3 dotted chartreuse bags, 3 dull red bags, 4 bright gold bags, 2 light lime bags.
dark indigo bags contain 5 shiny coral bags, 1 muted teal bag, 2 plaid purple bags, 4 faded yellow bags.
light maroon bags contain 1 wavy brown bag.
dotted brown bags contain 1 clear violet bag.
pale indigo bags contain 1 wavy brown bag, 2 dark olive bags, 4 pale black bags, 5 striped lavender bags.
pale purple bags contain 5 bright chartreuse bags, 1 vibrant magenta bag, 4 clear tomato bags, 4 light cyan bags.
dim teal bags contain 2 dark salmon bags, 5 mirrored gold bags, 3 bright gold bags.
wavy olive bags contain 1 vibrant purple bag, 3 dull silver bags.
pale aqua bags contain 4 dark violet bags, 2 dark plum bags, 3 vibrant brown bags.
muted cyan bags contain 5 vibrant crimson bags, 3 pale magenta bags.
vibrant fuchsia bags contain 2 light beige bags, 5 bright purple bags, 3 light maroon bags, 4 dull beige bags.
bright blue bags contain 4 vibrant plum bags.
vibrant green bags contain 1 dark salmon bag.
dull red bags contain 2 dotted maroon bags, 1 posh salmon bag, 3 dotted chartreuse bags, 2 dim yellow bags.
dotted magenta bags contain 3 plaid violet bags, 3 light gray bags.
wavy bronze bags contain 1 posh plum bag, 2 bright lavender bags.
shiny orange bags contain 3 muted plum bags.
plaid bronze bags contain 5 plaid chartreuse bags, 3 mirrored turquoise bags, 3 light salmon bags.
shiny yellow bags contain 4 striped teal bags, 1 vibrant maroon bag, 1 drab indigo bag, 4 muted beige bags.
faded indigo bags contain 2 posh lime bags, 1 vibrant teal bag.
posh tomato bags contain 4 striped salmon bags, 3 drab red bags.
light plum bags contain 3 bright blue bags, 5 dotted black bags, 4 shiny brown bags, 2 clear tan bags.
pale green bags contain 4 clear maroon bags, 4 dull green bags, 5 clear aqua bags, 3 drab beige bags.
drab brown bags contain 1 bright plum bag, 5 striped indigo bags, 1 vibrant lime bag.
muted lime bags contain 3 faded tan bags, 5 vibrant magenta bags, 5 posh coral bags.
faded violet bags contain 1 posh purple bag, 4 muted crimson bags, 5 striped red bags.
striped green bags contain 4 clear chartreuse bags, 4 dim maroon bags, 1 faded cyan bag, 5 faded silver bags.
dim plum bags contain 1 faded tan bag, 5 vibrant crimson bags, 3 light gray bags, 2 wavy teal bags.
drab cyan bags contain 4 muted plum bags, 5 mirrored black bags, 4 clear fuchsia bags.
vibrant lime bags contain 2 pale brown bags, 5 plaid violet bags.
drab purple bags contain 1 posh turquoise bag, 4 clear violet bags, 5 faded coral bags, 1 striped gold bag.
mirrored gray bags contain 3 dotted orange bags, 4 mirrored tomato bags, 4 plaid lime bags.
plaid teal bags contain 2 dim coral bags, 5 shiny magenta bags, 5 striped beige bags.
vibrant white bags contain 2 shiny red bags, 1 plaid black bag.
faded crimson bags contain 2 faded yellow bags.
dim chartreuse bags contain 4 mirrored teal bags, 5 light lavender bags.
wavy magenta bags contain 3 dark cyan bags.
mirrored magenta bags contain 4 muted salmon bags, 4 pale maroon bags.
plaid silver bags contain 2 pale turquoise bags, 3 posh salmon bags.
bright cyan bags contain 3 dark orange bags, 1 mirrored gold bag, 1 light violet bag, 5 faded silver bags.
faded orange bags contain 3 drab red bags, 5 dark tan bags, 2 vibrant magenta bags.
wavy gold bags contain 4 drab tomato bags, 2 muted yellow bags.
wavy salmon bags contain 2 dotted bronze bags, 3 light white bags, 2 dotted brown bags.
posh plum bags contain 4 drab black bags, 1 light silver bag.
dim aqua bags contain 5 striped black bags, 1 bright yellow bag, 4 posh salmon bags, 3 striped salmon bags.
shiny fuchsia bags contain 2 dim cyan bags.
dark tan bags contain 3 dull plum bags.
mirrored red bags contain 3 pale lime bags, 3 dim maroon bags.
bright purple bags contain 4 posh magenta bags, 4 wavy magenta bags, 3 posh plum bags, 3 dull lime bags.
striped olive bags contain 3 bright lavender bags, 3 mirrored black bags, 3 bright gold bags, 2 pale plum bags.
dotted bronze bags contain 3 dull coral bags, 1 faded black bag.
shiny green bags contain 1 shiny indigo bag.
mirrored chartreuse bags contain no other bags.
pale crimson bags contain 2 light orange bags, 3 light lime bags, 4 dotted cyan bags.
shiny lavender bags contain 5 shiny crimson bags, 5 striped tan bags.
wavy blue bags contain 1 pale brown bag, 2 light cyan bags, 1 light magenta bag, 4 pale tan bags.
muted plum bags contain 4 dull red bags, 1 dotted maroon bag, 1 vibrant red bag, 4 bright chartreuse bags.
vibrant violet bags contain 4 dull brown bags.
faded chartreuse bags contain 3 dotted yellow bags.
drab chartreuse bags contain 4 shiny gold bags.
posh crimson bags contain 3 clear cyan bags, 2 light crimson bags, 1 drab crimson bag, 5 clear blue bags.
drab tomato bags contain 4 striped salmon bags.
clear red bags contain 1 pale blue bag, 1 posh orange bag, 2 dark aqua bags, 5 posh red bags.
drab lavender bags contain 2 muted gray bags.
pale blue bags contain 5 pale beige bags, 3 muted green bags, 3 shiny white bags.
posh cyan bags contain 2 clear aqua bags, 2 drab chartreuse bags, 2 dark purple bags, 2 posh salmon bags.
faded silver bags contain 5 dim salmon bags, 2 striped bronze bags.
dim green bags contain 1 dark fuchsia bag.
plaid aqua bags contain 3 dim red bags, 3 drab turquoise bags, 3 dim aqua bags, 5 dull salmon bags.
posh fuchsia bags contain 2 dotted fuchsia bags.
striped lime bags contain 1 dull silver bag, 5 posh black bags, 1 dark fuchsia bag, 3 dull lime bags.
clear olive bags contain 1 pale crimson bag, 2 shiny orange bags, 2 posh magenta bags, 1 dark fuchsia bag.
bright lime bags contain 2 striped tan bags, 5 dull plum bags, 4 bright yellow bags.
faded green bags contain 2 pale turquoise bags, 5 light lime bags.
plaid indigo bags contain 1 drab crimson bag.
shiny turquoise bags contain 2 faded crimson bags.
drab aqua bags contain 4 mirrored red bags, 1 drab gold bag, 5 wavy orange bags.
dim gray bags contain 1 shiny lime bag, 5 dotted fuchsia bags.
light teal bags contain 5 pale beige bags, 4 shiny cyan bags, 2 striped red bags, 1 light orange bag.
wavy red bags contain 3 dotted tan bags, 3 pale aqua bags.
vibrant red bags contain no other bags.
striped salmon bags contain no other bags.
clear silver bags contain 1 shiny orange bag, 1 pale aqua bag, 1 faded purple bag, 2 dim coral bags.
muted tan bags contain 3 pale maroon bags, 4 dotted maroon bags, 2 bright plum bags, 4 pale teal bags.
faded yellow bags contain 2 striped black bags, 2 dotted chartreuse bags, 5 drab chartreuse bags, 5 shiny tomato bags.
dark green bags contain 1 light lime bag.
striped cyan bags contain 2 posh magenta bags, 2 dim cyan bags.
vibrant teal bags contain 2 dim magenta bags, 1 bright chartreuse bag, 5 bright tan bags, 1 bright yellow bag.
bright red bags contain 1 posh white bag.
bright magenta bags contain 3 posh salmon bags, 2 dull fuchsia bags, 1 posh lavender bag.
bright white bags contain 1 bright chartreuse bag, 1 mirrored yellow bag.
dotted teal bags contain 3 bright gray bags, 3 vibrant fuchsia bags.
clear blue bags contain 4 pale brown bags, 2 drab indigo bags, 2 pale salmon bags, 3 muted olive bags.
dull brown bags contain 1 dim cyan bag, 2 vibrant plum bags, 3 posh chartreuse bags.
vibrant tan bags contain 1 dark orange bag.
shiny white bags contain 3 mirrored violet bags, 1 drab indigo bag.
clear violet bags contain 2 vibrant crimson bags, 1 light gold bag, 2 striped silver bags.
bright coral bags contain 3 drab blue bags, 4 muted olive bags, 3 faded purple bags, 1 vibrant maroon bag.
dotted aqua bags contain 5 wavy black bags, 4 mirrored gold bags, 1 posh red bag, 2 plaid silver bags.
clear crimson bags contain 1 plaid gold bag.
faded fuchsia bags contain 5 shiny coral bags, 2 pale beige bags.
wavy crimson bags contain 4 dotted turquoise bags, 1 light gray bag, 5 wavy purple bags, 1 faded gray bag.
dark fuchsia bags contain 2 wavy brown bags, 3 vibrant orange bags.
striped plum bags contain 1 vibrant cyan bag, 3 posh lime bags.
shiny salmon bags contain 5 drab magenta bags, 4 mirrored turquoise bags.
dim brown bags contain 2 shiny gold bags, 5 dotted cyan bags, 3 plaid cyan bags.
posh violet bags contain 3 dim red bags, 2 posh white bags, 3 faded aqua bags, 4 shiny gold bags.
pale black bags contain 3 pale plum bags.
shiny red bags contain 4 posh salmon bags, 1 dotted chartreuse bag.
dull olive bags contain 2 light blue bags.
bright olive bags contain 2 striped olive bags, 3 muted plum bags, 2 striped magenta bags.
posh brown bags contain 1 vibrant gold bag, 2 wavy silver bags, 4 dotted salmon bags, 4 drab orange bags.
bright tan bags contain 3 light chartreuse bags.
dull beige bags contain 2 pale violet bags.
light yellow bags contain 2 clear indigo bags, 2 wavy brown bags, 2 bright black bags, 4 shiny lime bags.
dull aqua bags contain 2 dull black bags, 5 posh black bags, 2 wavy fuchsia bags.
dark gold bags contain 3 clear fuchsia bags, 1 dark cyan bag, 4 dark orange bags.
wavy white bags contain 2 dark brown bags, 5 drab yellow bags, 5 dotted turquoise bags, 4 muted tomato bags.
posh silver bags contain 2 dim chartreuse bags, 5 light fuchsia bags, 4 faded purple bags, 5 drab cyan bags.
dotted coral bags contain 5 plaid silver bags, 2 posh beige bags, 5 dim beige bags, 2 vibrant crimson bags.
drab silver bags contain 1 posh chartreuse bag.
dull teal bags contain 1 dim indigo bag.
wavy brown bags contain no other bags.
posh purple bags contain 1 wavy purple bag, 5 muted gold bags.
faded magenta bags contain 2 wavy aqua bags, 4 vibrant beige bags.
vibrant magenta bags contain 5 wavy black bags, 4 shiny maroon bags, 3 dim tomato bags, 5 vibrant gray bags.
mirrored brown bags contain 2 light aqua bags, 1 clear orange bag, 2 bright lavender bags.
light crimson bags contain 5 posh chartreuse bags.
dotted olive bags contain 5 dim tomato bags, 3 dim plum bags.
light indigo bags contain 1 bright gold bag, 4 drab chartreuse bags, 4 dim fuchsia bags, 3 vibrant black bags.
vibrant chartreuse bags contain 5 dim crimson bags, 1 clear plum bag, 4 striped black bags.
pale violet bags contain 3 dark salmon bags.
bright violet bags contain 3 striped aqua bags.
dull maroon bags contain 1 drab aqua bag, 3 mirrored lavender bags, 5 dotted brown bags.
dim lime bags contain 3 wavy salmon bags, 3 striped tan bags.
dotted tan bags contain 3 dull yellow bags, 3 shiny violet bags.
posh yellow bags contain 3 dull crimson bags, 4 dim olive bags, 4 dark black bags.
dull violet bags contain 4 bright yellow bags, 2 posh magenta bags, 5 shiny red bags.
dotted silver bags contain 2 wavy turquoise bags, 3 dull tomato bags, 3 bright tan bags, 1 dotted salmon bag.
pale gray bags contain 1 plaid turquoise bag, 4 bright salmon bags.
clear purple bags contain 5 shiny gold bags, 5 faded teal bags.
striped tan bags contain 1 mirrored cyan bag, 2 pale beige bags.
dotted indigo bags contain 2 pale purple bags, 2 pale black bags, 2 dark salmon bags.
clear turquoise bags contain 2 light lavender bags.
wavy plum bags contain 5 shiny aqua bags.
muted indigo bags contain 5 drab teal bags.
muted yellow bags contain 2 vibrant cyan bags, 1 dim white bag.
dark white bags contain 2 drab crimson bags, 5 dull gray bags.
faded blue bags contain 1 faded olive bag, 2 shiny magenta bags, 5 dark plum bags.
posh tan bags contain 2 posh plum bags, 5 muted black bags, 3 clear indigo bags, 4 striped gold bags.
striped silver bags contain 4 drab tomato bags.
muted lavender bags contain 3 dim silver bags, 2 wavy lavender bags, 1 faded tan bag.
wavy chartreuse bags contain 5 dull bronze bags.
dark blue bags contain 1 dotted silver bag, 3 light yellow bags, 3 mirrored bronze bags, 4 shiny lavender bags.
dim turquoise bags contain 3 pale green bags, 4 mirrored gray bags.
muted blue bags contain 1 striped lavender bag, 3 dark fuchsia bags.
faded brown bags contain 2 dotted violet bags, 5 faded indigo bags, 5 drab indigo bags.
shiny magenta bags contain 5 dotted turquoise bags, 3 plaid violet bags, 2 dim cyan bags.
clear chartreuse bags contain 3 pale maroon bags, 5 plaid blue bags, 1 clear tan bag.
faded turquoise bags contain 4 mirrored magenta bags.
posh turquoise bags contain 3 dotted yellow bags, 5 striped purple bags, 3 pale cyan bags.
vibrant tomato bags contain 4 dark cyan bags.
mirrored white bags contain 2 mirrored indigo bags, 3 dim cyan bags, 3 bright lavender bags.
dull purple bags contain 2 striped yellow bags, 3 dull plum bags, 3 shiny gold bags, 3 pale gold bags.
mirrored yellow bags contain 4 shiny crimson bags.
posh white bags contain 3 mirrored orange bags.
wavy fuchsia bags contain 3 dotted tan bags, 5 shiny coral bags.
mirrored green bags contain 1 dull white bag, 5 shiny crimson bags.
plaid turquoise bags contain 2 pale salmon bags, 4 dull beige bags.
clear cyan bags contain 1 dim silver bag, 4 drab chartreuse bags.
mirrored purple bags contain 1 dull coral bag, 3 vibrant plum bags.
dim lavender bags contain 1 striped black bag, 4 shiny red bags, 4 posh chartreuse bags, 2 dim teal bags.
plaid cyan bags contain 1 dim orange bag.
plaid magenta bags contain 5 striped red bags, 4 striped salmon bags.
shiny blue bags contain 2 shiny turquoise bags, 1 posh orange bag.
faded aqua bags contain 3 light yellow bags, 3 wavy purple bags, 5 dull lime bags, 5 dotted black bags.
mirrored blue bags contain 5 wavy silver bags.
posh indigo bags contain 5 dark tan bags, 2 vibrant blue bags, 5 dark bronze bags, 2 vibrant crimson bags.
clear plum bags contain 1 wavy teal bag, 1 faded yellow bag.
dark gray bags contain 4 bright lavender bags.
muted coral bags contain 4 shiny red bags, 2 pale teal bags, 4 dim olive bags, 3 muted silver bags.
dim gold bags contain 2 pale gold bags, 3 vibrant red bags.
plaid violet bags contain 3 faded green bags, 4 mirrored teal bags, 1 wavy purple bag, 1 faded yellow bag.
clear tomato bags contain 2 drab beige bags, 3 dim cyan bags.
bright beige bags contain 5 muted brown bags, 4 wavy red bags, 4 clear maroon bags.
wavy teal bags contain 4 muted beige bags, 1 posh salmon bag, 2 posh black bags, 2 dotted maroon bags.
vibrant salmon bags contain 4 vibrant purple bags, 4 dull chartreuse bags.
dull coral bags contain 2 light red bags, 3 dark plum bags, 3 bright gray bags, 1 dotted cyan bag.
bright turquoise bags contain 4 plaid teal bags, 3 muted orange bags.
wavy maroon bags contain 5 pale fuchsia bags, 5 dotted magenta bags.
plaid gold bags contain 2 shiny lavender bags, 1 vibrant gray bag, 5 mirrored teal bags.
wavy black bags contain 1 wavy magenta bag.
drab beige bags contain 1 mirrored chartreuse bag, 3 wavy brown bags, 4 pale beige bags, 2 pale turquoise bags.
posh blue bags contain 4 clear silver bags.
vibrant turquoise bags contain 1 posh white bag, 2 bright gold bags.
faded black bags contain 5 wavy black bags, 1 shiny crimson bag.
pale salmon bags contain 1 vibrant brown bag.
striped gray bags contain 1 mirrored violet bag, 4 dull violet bags, 4 muted turquoise bags.
light brown bags contain 5 muted crimson bags, 1 drab crimson bag, 4 muted aqua bags, 5 dotted blue bags.
striped turquoise bags contain 5 muted blue bags, 4 mirrored salmon bags.
shiny lime bags contain 1 vibrant purple bag, 4 pale turquoise bags, 4 drab tomato bags, 4 dotted maroon bags.
dotted white bags contain 5 pale violet bags, 1 posh plum bag, 1 shiny chartreuse bag, 2 faded bronze bags.
dotted crimson bags contain 2 shiny olive bags, 2 mirrored yellow bags.
mirrored teal bags contain 1 dull violet bag, 4 shiny red bags, 3 drab black bags, 1 posh magenta bag.
striped lavender bags contain 4 light crimson bags.
pale chartreuse bags contain 1 wavy red bag.
posh gray bags contain 3 posh black bags.
clear teal bags contain 4 dull violet bags, 4 dotted chartreuse bags, 3 drab tan bags.
light olive bags contain 3 muted olive bags, 4 plaid turquoise bags.
light tomato bags contain 5 dull chartreuse bags, 3 muted beige bags.
light orange bags contain 2 wavy lavender bags.
wavy coral bags contain 5 drab beige bags, 4 plaid white bags.
dotted violet bags contain 5 muted salmon bags, 5 shiny red bags, 3 shiny crimson bags.
muted fuchsia bags contain 5 dull coral bags.
pale turquoise bags contain 3 vibrant red bags.
faded beige bags contain 2 striped magenta bags.
dull tan bags contain 3 drab maroon bags, 3 muted beige bags.
posh lime bags contain 4 wavy turquoise bags, 2 light blue bags, 1 posh salmon bag.
drab magenta bags contain 5 dim magenta bags.
striped crimson bags contain 1 dull white bag, 4 muted plum bags, 1 posh chartreuse bag.
vibrant maroon bags contain 4 pale aqua bags.
dotted black bags contain 5 shiny bronze bags, 1 shiny lime bag, 5 dotted yellow bags, 1 wavy turquoise bag.
wavy aqua bags contain 3 dull tomato bags, 1 shiny olive bag, 4 vibrant brown bags, 2 dim chartreuse bags.
dim tan bags contain 2 bright plum bags, 4 striped gold bags, 4 dull coral bags.
dull fuchsia bags contain 5 wavy maroon bags.
striped red bags contain 5 shiny red bags, 4 clear gold bags, 4 posh magenta bags, 2 bright yellow bags.
dotted lavender bags contain 3 faded lavender bags.
muted turquoise bags contain 4 faded fuchsia bags.
bright gray bags contain 2 light silver bags, 3 dull violet bags.
dull indigo bags contain 2 dim violet bags, 3 plaid salmon bags, 5 plaid beige bags.
wavy purple bags contain 3 dim yellow bags, 1 posh salmon bag.
wavy lime bags contain 2 dark fuchsia bags, 3 dark salmon bags, 5 bright silver bags, 5 pale aqua bags.
light cyan bags contain 2 clear blue bags.
light beige bags contain 5 dull red bags, 3 dark violet bags, 5 shiny lime bags.
mirrored silver bags contain 1 plaid beige bag, 5 dull coral bags.
dark beige bags contain 1 clear tan bag, 4 wavy orange bags, 3 shiny cyan bags, 5 shiny magenta bags.
vibrant crimson bags contain 2 mirrored teal bags, 3 pale turquoise bags, 5 posh magenta bags.
faded red bags contain 3 plaid lime bags, 2 clear brown bags.
dim bronze bags contain 2 dark beige bags, 1 plaid cyan bag, 3 clear purple bags.
bright maroon bags contain 3 light gray bags, 2 faded turquoise bags, 1 posh cyan bag.
clear gray bags contain 4 faded green bags.
pale silver bags contain 3 dull magenta bags.
dotted red bags contain 2 clear purple bags, 1 faded crimson bag, 5 dull bronze bags, 5 muted plum bags.
striped maroon bags contain 5 mirrored cyan bags, 3 dark green bags, 4 clear indigo bags, 2 muted beige bags.
dark cyan bags contain 3 dotted maroon bags, 2 vibrant red bags.
clear bronze bags contain 1 drab lime bag, 5 light gold bags.
dull yellow bags contain 1 dull chartreuse bag, 1 muted olive bag.
plaid lavender bags contain 1 vibrant silver bag, 5 clear fuchsia bags.
posh black bags contain 5 dotted salmon bags, 4 drab tomato bags, 5 drab black bags.
faded lime bags contain 1 dark silver bag.
clear lavender bags contain 5 light violet bags.
dotted gray bags contain 4 clear lavender bags, 3 shiny magenta bags.
shiny gray bags contain 5 dull brown bags.
drab coral bags contain 2 faded beige bags.
dark teal bags contain 3 drab indigo bags, 2 light aqua bags, 1 faded tan bag, 2 wavy brown bags.
shiny violet bags contain 1 posh black bag, 5 dim beige bags.
clear salmon bags contain 5 clear orange bags.
shiny olive bags contain 2 shiny yellow bags, 1 shiny indigo bag, 4 bright yellow bags.
plaid salmon bags contain 4 striped yellow bags, 4 mirrored chartreuse bags, 3 light magenta bags, 2 mirrored magenta bags.
wavy orange bags contain 5 vibrant purple bags.
posh magenta bags contain 3 mirrored chartreuse bags, 4 vibrant red bags.
pale fuchsia bags contain 5 muted silver bags.
light black bags contain 5 wavy orange bags, 5 faded tomato bags.
light gold bags contain 1 dull red bag.
bright brown bags contain 5 mirrored beige bags, 5 faded indigo bags.
muted teal bags contain 5 posh magenta bags, 1 dim gray bag, 3 pale plum bags.
pale plum bags contain 2 muted beige bags, 2 posh magenta bags, 2 shiny gold bags.
drab gold bags contain 1 striped beige bag.
posh gold bags contain 3 shiny silver bags.
dull turquoise bags contain 4 vibrant crimson bags, 3 faded gray bags, 5 muted purple bags.
light chartreuse bags contain 2 bright lavender bags, 4 bright silver bags.
striped chartreuse bags contain 1 shiny coral bag, 2 clear blue bags, 2 dotted turquoise bags.
dark aqua bags contain 3 wavy bronze bags, 4 shiny brown bags, 2 bright violet bags, 1 dotted indigo bag.
muted bronze bags contain 3 pale salmon bags, 1 striped teal bag.
dark violet bags contain 2 wavy magenta bags.
dark maroon bags contain 2 muted red bags.
shiny silver bags contain 2 light gray bags, 1 pale aqua bag, 5 dim tomato bags.
bright lavender bags contain 5 striped red bags, 3 faded tan bags.
dim olive bags contain 3 posh cyan bags, 4 light aqua bags, 1 wavy tan bag, 3 dull silver bags.
posh beige bags contain 5 faded tan bags, 1 shiny lime bag, 4 wavy lavender bags.
muted maroon bags contain 3 mirrored purple bags, 2 mirrored gold bags, 1 clear tan bag.
vibrant yellow bags contain 4 light lavender bags.
light purple bags contain 1 faded olive bag, 1 wavy red bag.
bright yellow bags contain 3 dotted salmon bags, 4 posh magenta bags, 4 striped salmon bags.
dull gray bags contain 5 posh magenta bags, 1 shiny white bag, 2 dim bronze bags, 2 dim lavender bags.
vibrant plum bags contain 1 faded tan bag, 2 pale turquoise bags, 4 bright chartreuse bags, 4 dull violet bags.
posh chartreuse bags contain 1 bright chartreuse bag, 4 drab black bags, 2 posh magenta bags, 4 dark orange bags.
drab gray bags contain 4 plaid turquoise bags.
dark brown bags contain 4 dotted green bags, 3 dim lavender bags.
mirrored crimson bags contain 2 light teal bags, 2 plaid blue bags, 5 wavy red bags, 2 bright tomato bags.
dotted gold bags contain 4 bright olive bags.
dark salmon bags contain 3 pale turquoise bags, 5 faded tan bags, 1 mirrored chartreuse bag.
wavy gray bags contain 4 shiny green bags, 5 shiny red bags.
dotted blue bags contain 2 wavy yellow bags, 1 dull beige bag.
dim maroon bags contain 2 wavy maroon bags, 5 dim violet bags, 4 dark tan bags.
plaid purple bags contain 2 dark teal bags, 2 mirrored black bags, 1 wavy lavender bag.
dull blue bags contain 1 bright gold bag, 2 dim olive bags, 4 muted chartreuse bags, 2 striped salmon bags.
muted white bags contain 4 light bronze bags, 3 wavy beige bags.
muted gold bags contain no other bags.
drab green bags contain 2 plaid chartreuse bags.
clear coral bags contain 5 mirrored cyan bags.
drab turquoise bags contain 3 posh black bags.
dotted fuchsia bags contain 2 light red bags, 4 clear aqua bags, 1 posh magenta bag, 4 vibrant cyan bags.
clear lime bags contain 3 dark chartreuse bags.
mirrored plum bags contain 1 wavy tan bag, 2 bright olive bags.
vibrant coral bags contain 3 light gray bags, 5 light white bags.
pale bronze bags contain 2 bright silver bags, 5 vibrant tan bags, 4 posh lime bags, 3 wavy silver bags.
plaid blue bags contain 4 dotted beige bags, 2 wavy olive bags, 2 striped tomato bags.
shiny teal bags contain 2 shiny violet bags, 1 faded blue bag, 5 shiny white bags, 4 dim fuchsia bags.
clear black bags contain 4 faded purple bags, 1 dim tomato bag, 5 striped brown bags, 2 faded indigo bags.
clear orange bags contain 2 bright gold bags, 5 light crimson bags, 2 faded yellow bags.
drab maroon bags contain 1 vibrant red bag, 2 dotted bronze bags.
drab blue bags contain 1 mirrored aqua bag, 1 dark gold bag, 3 shiny crimson bags.
striped black bags contain 2 drab black bags, 5 dark orange bags.
light lavender bags contain 1 clear blue bag, 1 striped red bag.
posh bronze bags contain 5 light red bags, 4 dull plum bags, 1 dim coral bag, 3 clear blue bags.
plaid beige bags contain 5 dotted turquoise bags, 2 light cyan bags.
plaid fuchsia bags contain 3 wavy fuchsia bags.
shiny bronze bags contain 5 vibrant silver bags, 3 striped silver bags, 3 pale turquoise bags, 2 faded olive bags.
vibrant purple bags contain 3 wavy magenta bags.
pale magenta bags contain 4 dim yellow bags, 1 dim aqua bag.
faded purple bags contain 5 mirrored black bags, 1 muted beige bag, 1 muted aqua bag, 1 light maroon bag.
light turquoise bags contain 5 muted brown bags, 1 posh beige bag, 2 vibrant fuchsia bags, 3 faded teal bags.
vibrant lavender bags contain 1 light chartreuse bag, 3 mirrored teal bags, 5 drab lavender bags, 4 shiny brown bags.
striped yellow bags contain 1 dotted cyan bag, 3 mirrored turquoise bags.
drab bronze bags contain 3 shiny lavender bags, 5 muted yellow bags, 3 plaid teal bags, 2 plaid gold bags.
posh maroon bags contain 5 bright fuchsia bags, 3 dotted indigo bags, 5 dark teal bags, 1 faded violet bag.
vibrant cyan bags contain 2 dark orange bags.
striped aqua bags contain 2 light bronze bags, 1 dull beige bag, 4 pale violet bags, 5 pale beige bags.
faded gold bags contain 4 pale crimson bags.
muted olive bags contain 2 mirrored teal bags, 1 dim aqua bag, 3 posh chartreuse bags, 3 dull brown bags.
dim coral bags contain 1 mirrored gold bag.
dull silver bags contain 5 faded gray bags, 5 light red bags, 3 light crimson bags, 4 bright chartreuse bags.
vibrant gray bags contain 2 plaid silver bags, 5 plaid violet bags, 1 dim silver bag, 4 mirrored chartreuse bags.
plaid crimson bags contain 2 vibrant bronze bags, 1 drab olive bag, 1 pale purple bag.
dotted maroon bags contain no other bags.
vibrant brown bags contain 2 dull violet bags, 4 muted beige bags, 4 wavy teal bags.
bright tomato bags contain 3 muted beige bags.
shiny cyan bags contain 5 clear gold bags, 2 shiny lime bags, 4 wavy magenta bags, 2 wavy lavender bags.
drab tan bags contain 1 plaid red bag.
dull plum bags contain 4 dotted magenta bags, 1 plaid silver bag, 1 pale teal bag, 1 dim yellow bag.
clear gold bags contain 1 bright gold bag, 4 dark orange bags, 4 posh magenta bags.
shiny gold bags contain 5 dark salmon bags, 2 wavy purple bags, 5 dark cyan bags, 5 dull chartreuse bags.
mirrored tomato bags contain 3 light aqua bags, 4 pale plum bags, 1 pale beige bag.
dim tomato bags contain 5 light crimson bags, 2 bright lavender bags.
mirrored tan bags contain 1 vibrant plum bag, 2 faded violet bags, 5 striped lime bags, 3 muted white bags.
faded teal bags contain 1 drab silver bag.
dim red bags contain 2 clear turquoise bags, 3 drab maroon bags.
dark magenta bags contain 2 clear cyan bags.
vibrant gold bags contain 4 dotted salmon bags, 3 bright chartreuse bags, 3 striped purple bags.
muted brown bags contain 4 posh beige bags, 3 muted aqua bags, 5 dim beige bags, 4 dim magenta bags.
plaid orange bags contain 2 dark purple bags, 4 mirrored tomato bags, 1 vibrant orange bag.
pale gold bags contain 1 vibrant plum bag, 4 dotted violet bags.
plaid gray bags contain 3 bright silver bags, 5 drab fuchsia bags.
muted orange bags contain 5 dull magenta bags, 5 clear lavender bags, 4 mirrored chartreuse bags, 4 vibrant silver bags.
muted aqua bags contain 2 dim silver bags, 2 wavy black bags.
dim crimson bags contain 2 mirrored bronze bags, 4 muted cyan bags.
dark tomato bags contain 5 pale blue bags.
bright salmon bags contain 1 vibrant tan bag, 4 bright white bags, 1 dim gray bag.
mirrored orange bags contain 1 dark salmon bag, 5 drab beige bags, 5 dull chartreuse bags, 1 shiny cyan bag.
clear aqua bags contain 2 dim teal bags, 4 wavy olive bags.
bright bronze bags contain 3 shiny maroon bags.
vibrant black bags contain 3 muted gold bags, 2 striped red bags, 2 pale magenta bags, 4 clear violet bags.
clear yellow bags contain 2 plaid maroon bags.
pale lavender bags contain 1 shiny maroon bag, 5 bright cyan bags, 5 shiny orange bags, 4 striped tomato bags.
dark chartreuse bags contain 2 wavy brown bags.
mirrored violet bags contain 2 light lavender bags, 4 dull coral bags, 2 light red bags.
vibrant beige bags contain 2 shiny red bags, 2 clear tan bags.
mirrored coral bags contain 4 faded coral bags, 2 dull bronze bags.
posh red bags contain 4 wavy brown bags, 1 dark salmon bag, 5 dull chartreuse bags, 5 vibrant crimson bags.
light green bags contain 4 posh fuchsia bags.
wavy green bags contain 3 dark green bags, 4 posh chartreuse bags, 1 mirrored black bag.
drab violet bags contain 5 wavy yellow bags.
dark crimson bags contain 1 bright gray bag, 2 shiny violet bags, 3 pale chartreuse bags.
posh green bags contain 2 bright yellow bags, 2 faded yellow bags.
shiny plum bags contain 3 shiny indigo bags, 1 dark gold bag, 2 dim coral bags.
striped beige bags contain 2 muted beige bags.
dark orange bags contain 5 bright gold bags, 2 dotted maroon bags, 1 striped salmon bag, 3 vibrant red bags.
bright orange bags contain 4 muted blue bags, 5 striped blue bags, 4 dark cyan bags.
dark black bags contain 1 shiny lime bag, 1 clear olive bag, 4 dull bronze bags, 3 muted lavender bags.
pale orange bags contain 3 plaid violet bags, 1 shiny red bag, 1 dull coral bag, 1 shiny bronze bag.
mirrored salmon bags contain 4 vibrant red bags, 3 muted beige bags, 2 dark orange bags.
drab yellow bags contain 1 bright white bag.
dull tomato bags contain 4 muted beige bags, 3 posh salmon bags, 2 shiny maroon bags.
striped fuchsia bags contain 5 pale beige bags, 3 mirrored gray bags.
mirrored beige bags contain 5 mirrored black bags, 2 dim lavender bags, 1 clear lime bag.
wavy tomato bags contain 4 wavy fuchsia bags.
bright indigo bags contain 2 dull violet bags, 5 dull green bags, 3 dotted cyan bags, 2 dotted tan bags.
striped blue bags contain 1 posh red bag, 4 bright fuchsia bags, 4 dark aqua bags.
bright green bags contain 3 dim violet bags, 2 shiny coral bags, 1 dim white bag, 4 dim yellow bags.
dotted salmon bags contain 5 dull red bags, 2 striped salmon bags, 5 dotted maroon bags, 3 shiny red bags.
light magenta bags contain 1 dark fuchsia bag, 1 pale turquoise bag, 5 pale plum bags, 3 vibrant tan bags.
mirrored olive bags contain 1 shiny lavender bag.
dark coral bags contain 3 wavy teal bags, 4 muted plum bags.
posh teal bags contain 1 pale violet bag, 5 muted tan bags, 1 drab gray bag, 2 drab beige bags.
bright teal bags contain 5 mirrored coral bags.
striped orange bags contain 3 clear olive bags.
faded plum bags contain 5 striped black bags, 1 striped gold bag.
plaid tomato bags contain 1 muted salmon bag, 2 pale violet bags, 1 light violet bag, 3 dim tomato bags.
dim blue bags contain 4 drab salmon bags, 4 faded plum bags, 1 light salmon bag, 3 dark turquoise bags.
striped coral bags contain 3 wavy fuchsia bags.
light violet bags contain 4 dim beige bags, 4 striped lavender bags, 1 dotted orange bag, 1 wavy purple bag.
dull white bags contain 2 faded purple bags, 1 bright silver bag, 4 pale bronze bags, 3 clear fuchsia bags.
dim white bags contain 2 light yellow bags, 5 posh gold bags, 1 bright blue bag, 1 striped chartreuse bag.
bright chartreuse bags contain 1 muted gold bag, 1 dotted maroon bag.
striped purple bags contain 2 light orange bags, 1 dotted maroon bag, 3 dim magenta bags, 4 plaid violet bags.
dotted tomato bags contain 5 posh chartreuse bags.
wavy lavender bags contain 4 dim yellow bags, 4 pale turquoise bags, 4 vibrant red bags, 3 bright yellow bags.
striped teal bags contain 2 bright yellow bags.
drab crimson bags contain 1 wavy tan bag, 1 dull green bag, 3 muted blue bags.
dull lime bags contain 3 shiny tomato bags.
posh salmon bags contain no other bags.
vibrant aqua bags contain 2 shiny indigo bags, 3 shiny crimson bags, 4 shiny cyan bags.
drab black bags contain 3 dull violet bags, 4 dotted maroon bags, 3 vibrant purple bags, 3 muted plum bags.
drab olive bags contain 5 drab orange bags, 4 dotted green bags, 5 drab chartreuse bags.
dark plum bags contain 2 dotted salmon bags, 5 wavy magenta bags, 1 bright chartreuse bag.
plaid brown bags contain 2 light lavender bags.
striped magenta bags contain 5 pale lime bags, 4 posh salmon bags, 5 clear tomato bags, 5 dull plum bags.
dull orange bags contain 4 light maroon bags.
vibrant orange bags contain 5 dull red bags, 1 posh chartreuse bag.
mirrored turquoise bags contain 4 drab cyan bags, 1 posh cyan bag, 4 clear gold bags, 5 plaid magenta bags.
mirrored black bags contain no other bags.
shiny black bags contain 5 dotted green bags, 1 dim violet bag, 1 clear cyan bag, 2 muted fuchsia bags.
vibrant indigo bags contain 1 light maroon bag.
bright fuchsia bags contain 5 faded olive bags.
dotted plum bags contain 5 shiny violet bags.
plaid lime bags contain 2 bright gray bags, 4 pale beige bags, 4 light silver bags.
plaid red bags contain 1 shiny maroon bag, 4 striped lavender bags, 5 mirrored purple bags.
mirrored lime bags contain 5 faded coral bags, 3 dark gold bags, 5 mirrored indigo bags, 5 dull coral bags.
drab lime bags contain 2 dotted aqua bags, 5 shiny chartreuse bags.
faded tan bags contain 1 muted plum bag, 1 posh salmon bag.
dark silver bags contain 4 dotted maroon bags, 4 shiny white bags.
striped indigo bags contain 5 dull plum bags, 2 light lavender bags, 3 light red bags, 1 muted olive bag.
bright gold bags contain no other bags.
plaid black bags contain 2 dull violet bags, 5 muted olive bags, 1 muted teal bag.
dotted chartreuse bags contain no other bags.
vibrant blue bags contain 1 shiny cyan bag.
dim indigo bags contain 1 bright purple bag, 1 plaid magenta bag, 5 posh fuchsia bags, 5 plaid red bags.
light red bags contain 5 bright gold bags, 4 plaid silver bags, 1 dull violet bag, 4 pale turquoise bags.
dim black bags contain 3 dim orange bags, 5 dull lime bags, 2 faded indigo bags, 3 dotted olive bags.
mirrored gold bags contain 2 muted gold bags, 5 dark cyan bags.
posh aqua bags contain 1 clear violet bag.
light blue bags contain 3 drab chartreuse bags, 2 dull chartreuse bags.
shiny maroon bags contain 1 wavy violet bag.
faded lavender bags contain 1 dark salmon bag, 5 vibrant orange bags, 3 vibrant purple bags, 5 posh black bags.
faded olive bags contain 2 mirrored teal bags, 5 pale plum bags, 4 pale brown bags.
drab indigo bags contain 1 dim cyan bag, 1 plaid silver bag.
clear white bags contain 4 posh beige bags.
wavy violet bags contain 5 dotted fuchsia bags.
dark turquoise bags contain 5 vibrant turquoise bags, 3 vibrant lavender bags.
striped violet bags contain 5 mirrored turquoise bags, 1 muted orange bag, 3 dim teal bags, 4 posh green bags.
wavy yellow bags contain 2 dim yellow bags, 5 dim lavender bags.
dark red bags contain 4 striped gold bags, 3 vibrant tomato bags.
plaid maroon bags contain 5 light white bags, 5 plaid black bags.
bright black bags contain 3 light maroon bags, 5 shiny lime bags, 2 vibrant maroon bags, 3 clear violet bags.
drab salmon bags contain 2 clear coral bags, 4 dark indigo bags.
plaid green bags contain 2 pale indigo bags.
pale teal bags contain 4 drab black bags, 3 faded gray bags, 5 posh beige bags, 4 faded yellow bags.
light silver bags contain 5 bright yellow bags, 1 dim silver bag, 5 posh chartreuse bags.
dull magenta bags contain 3 posh turquoise bags, 3 light magenta bags, 4 shiny orange bags, 4 clear turquoise bags.
pale white bags contain 5 dark cyan bags.
dull chartreuse bags contain 3 mirrored black bags, 3 dotted salmon bags, 5 pale turquoise bags.
dim salmon bags contain 2 mirrored yellow bags, 5 striped salmon bags, 1 drab tomato bag, 5 dull yellow bags.
shiny crimson bags contain 5 faded tan bags, 2 muted salmon bags, 1 wavy teal bag, 3 vibrant orange bags.
dark purple bags contain 2 muted plum bags, 5 bright lavender bags, 1 dark cyan bag, 4 clear orange bags.
clear brown bags contain 2 dim orange bags, 1 vibrant maroon bag, 2 striped lime bags.
muted silver bags contain 5 vibrant gray bags.
vibrant bronze bags contain 3 posh red bags.
mirrored maroon bags contain 3 clear magenta bags, 2 posh brown bags, 5 wavy teal bags.
muted tomato bags contain 5 faded aqua bags, 4 wavy lavender bags, 1 mirrored silver bag.
posh olive bags contain 4 faded salmon bags, 1 muted green bag, 5 light tomato bags, 3 dark gold bags.
dotted turquoise bags contain 5 light orange bags, 1 dull brown bag.
light bronze bags contain 2 pale cyan bags, 3 shiny lime bags, 2 faded olive bags.
striped gold bags contain 4 muted salmon bags, 1 bright yellow bag, 1 dark plum bag, 4 light maroon bags.
faded maroon bags contain 5 wavy silver bags, 3 plaid magenta bags.
clear magenta bags contain 2 wavy turquoise bags.
vibrant olive bags contain 1 muted silver bag.
clear tan bags contain 4 mirrored gold bags.
posh orange bags contain 3 plaid blue bags, 4 dotted aqua bags.
wavy cyan bags contain 3 posh lavender bags.
shiny chartreuse bags contain 5 mirrored cyan bags, 3 posh chartreuse bags, 4 dotted aqua bags.
light lime bags contain 5 muted plum bags, 2 wavy purple bags.
wavy silver bags contain 4 faded lavender bags.
drab red bags contain 4 clear tomato bags, 4 pale turquoise bags, 2 dull yellow bags.
light aqua bags contain 3 dotted aqua bags.
dim purple bags contain 2 striped gold bags, 2 drab tan bags, 2 mirrored tan bags.
shiny indigo bags contain 1 pale magenta bag, 5 dim plum bags, 3 muted blue bags, 4 dim coral bags.
pale lime bags contain 2 mirrored cyan bags, 4 dull violet bags, 1 striped lime bag.
posh lavender bags contain 5 clear purple bags, 2 muted gold bags, 5 dull brown bags, 4 muted lime bags.
dull lavender bags contain 1 striped violet bag, 3 muted bronze bags.
dotted lime bags contain 3 plaid magenta bags, 5 plaid violet bags, 1 shiny lime bag, 3 plaid purple bags.
posh coral bags contain 5 mirrored violet bags, 1 clear violet bag, 1 dark fuchsia bag, 3 dotted silver bags.
bright plum bags contain 5 wavy brown bags.
pale coral bags contain 3 bright olive bags.
dim fuchsia bags contain 2 bright chartreuse bags, 4 mirrored teal bags, 4 posh salmon bags, 3 light chartreuse bags.
dim cyan bags contain 2 faded tan bags, 4 mirrored gold bags.
faded cyan bags contain 1 dotted black bag, 1 shiny maroon bag, 2 muted chartreuse bags.
        """.trimIndent()
    }
}


/**
 * DAY 7 PROBLEM 1
 */
object InputDay8Problem1 : Inputs() {
    override fun getInput(): String {
        return """
jmp +149
acc -11
nop +95
acc -6
jmp +196
acc +2
acc -6
acc +38
acc +18
jmp +246
acc +43
acc +37
acc -1
jmp +390
acc +32
acc -15
jmp +487
jmp +382
jmp +71
jmp +331
acc -3
acc -12
acc +4
jmp +417
acc +30
acc +20
jmp +410
acc +22
acc +25
acc +19
acc +5
jmp +405
acc +15
acc +33
acc +7
acc -18
jmp +463
acc +25
acc +8
acc +1
jmp +64
jmp +1
jmp +562
jmp +4
acc +21
acc +12
jmp +467
nop +197
acc +32
jmp +7
acc +2
jmp +352
acc +15
jmp +289
acc +39
jmp +448
jmp +227
acc +17
acc +4
jmp +326
acc -1
nop +167
acc +30
nop +471
jmp +101
acc +45
nop +276
acc +12
jmp +215
nop +80
acc +23
acc +31
jmp +104
acc +39
acc +15
jmp +40
nop +433
acc +21
acc +22
acc +37
jmp +421
acc +14
jmp -30
acc +42
acc +38
jmp +203
acc -8
acc +27
jmp +102
acc -5
acc +0
acc +18
acc +26
jmp +212
acc +25
acc +18
jmp +209
acc +18
acc +44
acc +47
nop -40
jmp +372
acc +29
jmp +384
acc +39
acc -11
acc +43
jmp +406
acc +2
nop +439
jmp +343
acc +29
acc +18
jmp +457
jmp -31
jmp +146
acc +12
acc +26
nop +98
jmp +125
acc +6
acc +35
acc +48
acc +44
jmp +497
acc +17
acc -8
jmp +223
acc +47
jmp +405
jmp +212
jmp +317
acc -13
acc -6
jmp +94
acc +47
acc +50
acc -16
acc +38
jmp +290
jmp +383
nop -44
acc +38
nop +418
acc +42
jmp +233
nop -94
acc +46
jmp +413
acc +10
acc -6
jmp +410
acc +30
jmp -93
acc -13
jmp +6
acc -16
acc +18
nop +403
acc +0
jmp +68
acc +45
jmp +302
acc +5
jmp +26
acc -5
acc +49
jmp +412
acc +3
acc +14
jmp +278
acc +6
acc +4
jmp -58
acc +14
jmp -60
acc -12
acc +23
jmp +225
acc +9
acc +17
acc -10
acc -13
jmp +216
acc -8
nop +363
jmp +84
nop +300
acc -15
jmp +415
acc +17
acc -11
nop +96
jmp +377
nop +259
acc +4
jmp +327
acc +0
jmp +149
jmp +12
acc +23
acc +43
acc +2
jmp +1
jmp +400
acc +24
jmp +114
acc +3
acc -13
jmp +149
jmp +100
jmp +1
jmp +157
acc +23
acc -15
jmp -139
nop -85
jmp +201
acc -2
acc +39
acc +30
nop -93
jmp -11
acc +46
jmp +285
jmp +1
acc +41
jmp +115
acc +48
acc -12
acc -17
jmp -15
nop +82
acc +25
jmp -151
acc +20
acc -14
acc +9
acc -9
jmp +284
acc +27
acc +38
acc +50
jmp +145
nop +279
jmp -55
nop +245
jmp +254
acc +4
jmp +368
nop -119
acc -11
acc +16
acc +19
jmp -54
nop -186
nop -187
acc +9
acc +44
jmp -222
jmp +253
nop -234
acc +33
acc +35
acc -17
jmp +11
acc +2
acc +41
acc +47
jmp +310
acc +0
acc -8
acc +1
jmp +55
acc -1
jmp -257
acc +7
acc +44
nop +253
acc +41
jmp +302
acc +16
jmp -185
jmp +140
jmp +1
nop +3
acc +35
jmp -267
acc +6
jmp -269
jmp +211
acc +30
acc +14
acc +16
acc +41
jmp -47
jmp -192
nop -21
acc -1
jmp +192
acc -6
acc +15
acc +3
nop -247
jmp -88
jmp +164
acc +47
nop +43
acc +40
jmp +151
jmp +85
jmp +1
acc +40
jmp -257
acc +13
acc +13
jmp -256
acc +25
acc +39
jmp +260
acc +13
acc -18
acc -19
acc -14
jmp -10
acc -16
acc +9
jmp -199
nop +185
acc +38
jmp -261
nop +200
acc -18
nop +115
acc +36
jmp -259
acc +47
acc -2
acc +9
jmp -139
nop -117
jmp -13
jmp +1
jmp +247
acc +19
acc +49
jmp +177
acc -1
jmp +249
jmp -218
acc +12
acc +33
jmp +108
jmp -48
nop -205
acc +32
jmp -159
jmp -129
acc +32
jmp +1
jmp +249
nop +75
acc +17
acc -16
jmp +253
acc -9
jmp -12
acc +15
jmp -14
acc +13
acc -8
nop -13
jmp +27
nop -336
acc +33
acc +10
acc -1
jmp -350
nop -134
acc -11
jmp +5
acc +10
acc +13
acc +13
jmp -249
acc +8
jmp -215
jmp +49
acc +35
acc +28
jmp -54
acc +14
nop -264
jmp +1
jmp -166
jmp -291
acc +9
acc +43
jmp -301
nop +149
acc -9
jmp -81
jmp -287
acc +9
acc +35
acc -12
jmp -295
acc +46
jmp -394
acc +29
acc +19
acc +9
jmp -58
acc +7
acc +32
nop -261
acc +44
jmp -365
jmp +1
jmp +120
acc +37
nop -177
jmp +101
acc +42
acc +13
acc +36
jmp -343
acc +45
jmp -408
acc +23
acc +0
jmp -66
jmp +1
acc +34
acc +19
jmp +104
jmp +1
acc +36
jmp -141
jmp -44
acc +9
acc +30
acc +18
acc +0
jmp -303
jmp +1
acc +12
jmp +66
acc +0
jmp +82
acc +43
acc +18
jmp +49
acc -16
acc -3
acc +0
jmp -249
acc -2
nop +81
jmp +40
jmp +94
acc -16
acc +1
jmp -445
jmp +1
acc +22
jmp -130
acc +44
jmp -73
acc +3
acc +5
jmp -121
jmp -352
jmp -163
acc +15
acc +47
nop +141
jmp +140
acc -18
nop -289
acc +16
jmp -476
acc -19
nop +134
acc -10
acc +37
jmp -13
jmp -359
acc +32
acc +14
jmp -306
acc +25
acc +30
jmp -441
acc +44
acc +14
acc +12
acc +19
jmp -387
jmp -12
jmp -180
jmp -113
jmp -29
acc +34
acc -13
acc -12
nop +73
jmp -263
jmp -373
jmp -360
acc +38
nop -123
jmp -176
nop -155
acc -11
acc +32
nop +54
jmp -461
acc +31
acc +10
acc -7
acc -19
jmp -212
acc +41
acc +4
nop -2
jmp -483
acc +16
acc +42
acc -15
jmp -286
jmp -122
acc -4
jmp -436
acc +27
jmp -508
acc +38
nop -309
jmp +10
acc +31
acc +18
acc +5
jmp -119
acc +8
acc -7
acc -16
acc +18
jmp -416
acc -15
acc +1
acc +30
acc +8
jmp -476
jmp -298
acc +29
acc +24
acc -9
acc +35
jmp -438
nop -5
jmp -100
acc +5
acc +3
acc +5
acc -4
jmp +14
acc +43
acc +3
acc +40
jmp -517
acc +10
acc +35
acc +38
jmp -120
acc +1
acc -18
acc +0
acc +42
jmp -69
jmp -101
acc +1
jmp -271
acc +37
acc +17
jmp +1
jmp -401
acc +1
acc +3
acc -8
jmp -392
nop -99
acc +2
jmp -301
acc +10
acc +32
acc +3
jmp -286
jmp +1
jmp -444
nop -364
acc +46
acc +30
acc -2
jmp -13
nop -65
acc +22
jmp -292
acc -13
jmp -480
acc +4
acc -8
nop -500
jmp -113
acc -16
acc +40
acc -18
jmp -125
jmp -482
acc +28
acc -5
jmp -471
acc +33
acc +49
acc +21
acc +9
jmp +1
        """.trimIndent()
    }
}

/**
 * DAY 8 PROBLEM 2
 */
object InputDay8Problem2 : Inputs() {
    override fun getInput(): String {
        return """
jmp +149
acc -11
nop +95
acc -6
jmp +196
acc +2
acc -6
acc +38
acc +18
jmp +246
acc +43
acc +37
acc -1
jmp +390
acc +32
acc -15
jmp +487
jmp +382
jmp +71
jmp +331
acc -3
acc -12
acc +4
jmp +417
acc +30
acc +20
jmp +410
acc +22
acc +25
acc +19
acc +5
jmp +405
acc +15
acc +33
acc +7
acc -18
jmp +463
acc +25
acc +8
acc +1
jmp +64
jmp +1
jmp +562
jmp +4
acc +21
acc +12
jmp +467
nop +197
acc +32
jmp +7
acc +2
jmp +352
acc +15
jmp +289
acc +39
jmp +448
jmp +227
acc +17
acc +4
jmp +326
acc -1
nop +167
acc +30
nop +471
jmp +101
acc +45
nop +276
acc +12
jmp +215
nop +80
acc +23
acc +31
jmp +104
acc +39
acc +15
jmp +40
nop +433
acc +21
acc +22
acc +37
jmp +421
acc +14
jmp -30
acc +42
acc +38
jmp +203
acc -8
acc +27
jmp +102
acc -5
acc +0
acc +18
acc +26
jmp +212
acc +25
acc +18
jmp +209
acc +18
acc +44
acc +47
nop -40
jmp +372
acc +29
jmp +384
acc +39
acc -11
acc +43
jmp +406
acc +2
nop +439
jmp +343
acc +29
acc +18
jmp +457
jmp -31
jmp +146
acc +12
acc +26
nop +98
jmp +125
acc +6
acc +35
acc +48
acc +44
jmp +497
acc +17
acc -8
jmp +223
acc +47
jmp +405
jmp +212
jmp +317
acc -13
acc -6
jmp +94
acc +47
acc +50
acc -16
acc +38
jmp +290
jmp +383
nop -44
acc +38
nop +418
acc +42
jmp +233
nop -94
acc +46
jmp +413
acc +10
acc -6
jmp +410
acc +30
jmp -93
acc -13
jmp +6
acc -16
acc +18
nop +403
acc +0
jmp +68
acc +45
jmp +302
acc +5
jmp +26
acc -5
acc +49
jmp +412
acc +3
acc +14
jmp +278
acc +6
acc +4
jmp -58
acc +14
jmp -60
acc -12
acc +23
jmp +225
acc +9
acc +17
acc -10
acc -13
jmp +216
acc -8
nop +363
jmp +84
nop +300
acc -15
jmp +415
acc +17
acc -11
nop +96
jmp +377
nop +259
acc +4
jmp +327
acc +0
jmp +149
jmp +12
acc +23
acc +43
acc +2
jmp +1
jmp +400
acc +24
jmp +114
acc +3
acc -13
jmp +149
jmp +100
jmp +1
jmp +157
acc +23
acc -15
jmp -139
nop -85
jmp +201
acc -2
acc +39
acc +30
nop -93
jmp -11
acc +46
jmp +285
jmp +1
acc +41
jmp +115
acc +48
acc -12
acc -17
jmp -15
nop +82
acc +25
jmp -151
acc +20
acc -14
acc +9
acc -9
jmp +284
acc +27
acc +38
acc +50
jmp +145
nop +279
jmp -55
nop +245
jmp +254
acc +4
jmp +368
nop -119
acc -11
acc +16
acc +19
jmp -54
nop -186
nop -187
acc +9
acc +44
jmp -222
jmp +253
nop -234
acc +33
acc +35
acc -17
jmp +11
acc +2
acc +41
acc +47
jmp +310
acc +0
acc -8
acc +1
jmp +55
acc -1
jmp -257
acc +7
acc +44
nop +253
acc +41
jmp +302
acc +16
jmp -185
jmp +140
jmp +1
nop +3
acc +35
jmp -267
acc +6
jmp -269
jmp +211
acc +30
acc +14
acc +16
acc +41
jmp -47
jmp -192
nop -21
acc -1
jmp +192
acc -6
acc +15
acc +3
nop -247
jmp -88
jmp +164
acc +47
nop +43
acc +40
jmp +151
jmp +85
jmp +1
acc +40
jmp -257
acc +13
acc +13
jmp -256
acc +25
acc +39
jmp +260
acc +13
acc -18
acc -19
acc -14
jmp -10
acc -16
acc +9
jmp -199
nop +185
acc +38
jmp -261
nop +200
acc -18
nop +115
acc +36
jmp -259
acc +47
acc -2
acc +9
jmp -139
nop -117
jmp -13
jmp +1
jmp +247
acc +19
acc +49
jmp +177
acc -1
jmp +249
jmp -218
acc +12
acc +33
jmp +108
jmp -48
nop -205
acc +32
jmp -159
jmp -129
acc +32
jmp +1
jmp +249
nop +75
acc +17
acc -16
jmp +253
acc -9
jmp -12
acc +15
jmp -14
acc +13
acc -8
nop -13
jmp +27
nop -336
acc +33
acc +10
acc -1
jmp -350
nop -134
acc -11
jmp +5
acc +10
acc +13
acc +13
jmp -249
acc +8
jmp -215
jmp +49
acc +35
acc +28
jmp -54
acc +14
nop -264
jmp +1
jmp -166
jmp -291
acc +9
acc +43
jmp -301
nop +149
acc -9
jmp -81
jmp -287
acc +9
acc +35
acc -12
jmp -295
acc +46
jmp -394
acc +29
acc +19
acc +9
jmp -58
acc +7
acc +32
nop -261
acc +44
jmp -365
jmp +1
jmp +120
acc +37
nop -177
jmp +101
acc +42
acc +13
acc +36
jmp -343
acc +45
jmp -408
acc +23
acc +0
jmp -66
jmp +1
acc +34
acc +19
jmp +104
jmp +1
acc +36
jmp -141
jmp -44
acc +9
acc +30
acc +18
acc +0
jmp -303
jmp +1
acc +12
jmp +66
acc +0
jmp +82
acc +43
acc +18
jmp +49
acc -16
acc -3
acc +0
jmp -249
acc -2
nop +81
jmp +40
jmp +94
acc -16
acc +1
jmp -445
jmp +1
acc +22
jmp -130
acc +44
jmp -73
acc +3
acc +5
jmp -121
jmp -352
jmp -163
acc +15
acc +47
nop +141
jmp +140
acc -18
nop -289
acc +16
jmp -476
acc -19
nop +134
acc -10
acc +37
jmp -13
jmp -359
acc +32
acc +14
jmp -306
acc +25
acc +30
jmp -441
acc +44
acc +14
acc +12
acc +19
jmp -387
jmp -12
jmp -180
jmp -113
jmp -29
acc +34
acc -13
acc -12
nop +73
jmp -263
jmp -373
jmp -360
acc +38
nop -123
jmp -176
nop -155
acc -11
acc +32
nop +54
jmp -461
acc +31
acc +10
acc -7
acc -19
jmp -212
acc +41
acc +4
nop -2
jmp -483
acc +16
acc +42
acc -15
jmp -286
jmp -122
acc -4
jmp -436
acc +27
jmp -508
acc +38
nop -309
jmp +10
acc +31
acc +18
acc +5
jmp -119
acc +8
acc -7
acc -16
acc +18
jmp -416
acc -15
acc +1
acc +30
acc +8
jmp -476
jmp -298
acc +29
acc +24
acc -9
acc +35
jmp -438
nop -5
jmp -100
acc +5
acc +3
acc +5
acc -4
jmp +14
acc +43
acc +3
acc +40
jmp -517
acc +10
acc +35
acc +38
jmp -120
acc +1
acc -18
acc +0
acc +42
jmp -69
jmp -101
acc +1
jmp -271
acc +37
acc +17
jmp +1
jmp -401
acc +1
acc +3
acc -8
jmp -392
nop -99
acc +2
jmp -301
acc +10
acc +32
acc +3
jmp -286
jmp +1
jmp -444
nop -364
acc +46
acc +30
acc -2
jmp -13
nop -65
acc +22
jmp -292
acc -13
jmp -480
acc +4
acc -8
nop -500
jmp -113
acc -16
acc +40
acc -18
jmp -125
jmp -482
acc +28
acc -5
jmp -471
acc +33
acc +49
acc +21
acc +9
jmp +1
        """.trimIndent()
    }
}
