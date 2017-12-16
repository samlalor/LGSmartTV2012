# LGSmartTV2012
A Device Handler to connect 2012-2013 LG Smart TV's to Smart Things

This is based on a similar project that connects Smartthings to Pre 2012 LG Smart TVs.

Reference:
https://github.com/dan06/SmartThings-LG-Smart-TV

Allows you to connect your LG Smart TV to Smartthings, use some basic controls and power off the TV through commands such as Alexa/ActionTiles/Google Assistant etc. At the minute the only control you can use through these apps is power off.

Simply add the Device Discovery Smart App and Device Handler to your IDE and follow the instructions. You LG Smart TV must be powered on and allowing remote control.

This will NOT turn the on as it sends XML Packages to the TV over the network and it wont respond to these packages when powered off.

For more information on the LG Remote App API please see: http://developer.lgappstv.com/TV_HELP/index.jsp?topic=%2Flge.tvsdk.references.book%2Fhtml%2FUDAP%2FUDAP%2FHandleTouchMove.htm

If you wish to add more commands, a full list of remote control commands are listed below




<html>
<table class="table_1">
            <colgroup><col style="width: 106pt;">
            <col style="width: 255pt;">
            </colgroup><tbody><tr style="height: 17pt;">
                <td class="td_1">
                    <p class="p_2">Virtual key code </p>
                    <p class="p_2">(decimal number)</p>
                </td>
                <td class="td_2">
                    <p class="p_2">Description</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">1</p>
                </td>
                <td class="td_4">
                    <p class="p_15">POWER</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">2</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 0</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">3</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 1</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">4</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 2</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">5</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 3</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">6</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 4</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">7</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 5</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">8</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 6</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">9</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 7</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">10</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 8</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">11</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Number 9</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">12</p>
                </td>
                <td class="td_4">
                    <p class="p_1"><span class="span_61">UP key among remote </span><span class="span_61">Controller</span><span class="span_61">’</span><span class="span_61">s 4 direction keys</span>
                    </p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">13</p>
                </td>
                <td class="td_4">
                    <p class="p_1"><span class="span_61">DOWN key among remote </span><span class="span_61">Controller</span><span class="span_61">’</span><span class="span_61">s 4 direction keys</span>
                    </p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">14</p>
                </td>
                <td class="td_4">
                    <p class="p_1"><span class="span_61">LEFT key among remote </span><span class="span_61">Controller</span><span class="span_61">’</span><span class="span_61">s 4 direction keys</span>
                    </p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">15</p>
                </td>
                <td class="td_4">
                    <p class="p_1"><span class="span_61">RIGHT key among remote </span><span class="span_61">Controller</span><span class="span_61">’</span><span class="span_61">s 4 direction keys</span>
                    </p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">20</p>
                </td>
                <td class="td_4">
                    <p class="p_15">OK</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">21</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Home menu</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">22</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Menu key (same with Home menu key)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">23</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Previous key (Back)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">24</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Volume up</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">25</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Volume down</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">26</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Mute (toggle)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">27</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Channel UP (+)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">28</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Channel DOWN (-)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">29</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Blue key of data broadcast</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">30</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Green key of data broadcast</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">31</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Red key of data broadcast</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">32</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Yellow key of data broadcast</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">33</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Play</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">34</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Pause</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">35</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Stop</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">36</p>
                </td>
                <td class="td_4">
                    <p class="p_1"><span class="span_61">F</span><span class="span_61">a</span><span class="span_61">st forward (FF)</span>
                    </p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">37</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Rewind (REW)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">38</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Skip Forward</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">39</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Skip Backward</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">40</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Record</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">41</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Recording list</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">42</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Repeat</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">43</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Live TV</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">44</p>
                </td>
                <td class="td_4">
                    <p class="p_15">EPG</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">45</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Current program information</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">46</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Aspect ratio</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">47</p>
                </td>
                <td class="td_4">
                    <p class="p_15">External input</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">48</p>
                </td>
                <td class="td_4">
                    <p class="p_15">PIP secondary video</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">49</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Show / Change subtitle</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">50</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Program list</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">51</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Tele Text</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">52</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Mark</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">400</p>
                </td>
                <td class="td_4">
                    <p class="p_15">3D Video</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">401</p>
                </td>
                <td class="td_4">
                    <p class="p_15">3D L/R</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">402</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Dash (-)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">403</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Previous channel (Flash back)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">404</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Favorite channel</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">405</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Quick menu</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">406</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Text Option</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">407</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Audio Description</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">408</p>
                </td>
                <td class="td_4">
                    <p class="p_15">NetCast key (same with Home menu)</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">409</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Energy saving</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">410</p>
                </td>
                <td class="td_4">
                    <p class="p_15">A/V mode</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">411</p>
                </td>
                <td class="td_4">
                    <p class="p_15">SIMPLINK</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">412</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Exit</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">413</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Reservation programs list</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">414</p>
                </td>
                <td class="td_4">
                    <p class="p_15">PIP channel UP</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">415</p>
                </td>
                <td class="td_4">
                    <p class="p_15">PIP channel DOWN</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">416</p>
                </td>
                <td class="td_4">
                    <p class="p_15">Switching between primary/secondary video</p>
                </td>
            </tr>
            <tr style="height: 21pt;">
                <td class="td_3">
                    <p class="p_15">417</p>
                </td>
                <td class="td_4">
                    <p class="p_15">My Apps</p>
                </td>
            </tr>
        </tbody></table>
  </html>
